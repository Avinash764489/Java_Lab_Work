package com.ques_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AutherInformation {

	Scanner sc = new Scanner(System.in);

	private static Connection connect() throws SQLException {
		String port = "3307";
		String database = "sakila";
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:" + port + "/" + database;
		return DriverManager.getConnection(url, username, password);
	}

	public void insert() throws SQLException {

		Connection conn = connect();
		System.out.println("Enter author id");
		int id = sc.nextInt();
		System.out.println("Enter author name");
		String name = sc.next();
		System.out.println("Enter author city name");
		String city = sc.next();
		Statement s = conn.createStatement();
		int status = s.executeUpdate(
				"INSERT INTO author(id, first_name, last_name) values(" + id + "','" + name + "','" + city + "')");
		if (status == 1)
			System.out.println("Insert complete");
		else
			System.out.println("Error");
	}

	public void display() throws SQLException {

		Connection conn = connect();
		Statement s = conn.createStatement();
		System.out.print("id    ");
		System.out.print("name     ");
		System.out.print("city    ");
		System.out.println();
		ResultSet rs = s.executeQuery("SELECT * FROM author where city like 's%'");
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "   ");
			System.out.print(rs.getString(2) + "   ");
			System.out.print(rs.getString(3) + "   ");
			System.out.println();
		}
	}

	public static void main(String arg[]) throws SQLException {

		int choice, ch;

		InsertAndRetrive obj = new InsertAndRetrive();

		Scanner sc = new Scanner(System.in);

		do {
			ch = 0;
			System.out.println("Enter your choice");
			System.out.println("Enter 1 if you want to insert data in table");
			System.out.println("Enter 2 if you want to display data from table");
			System.out.println("Enter 0 if you want to exit from this program");
			choice = sc.nextInt();
			switch (choice) {

			case 1: {
				obj.insert();
				break;
			}
			case 2: {
				obj.display();
				break;
			}
			case 3: {
				System.exit(0);
			}
			default:
				System.out.println("Your choice is not valid");
			}
			System.out.println("Enter 1 if you want to show choice again");
			ch = sc.nextInt();
		} while (ch > 0);
	}
}
