package com.ques_02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Products {

	public static void main(String arg[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int id, choice;
		double price;
		String name, input;
		do {
			choice = 0;
			System.out.println("Enter Product ID");
			id = sc.nextInt();
			System.out.println("Enter Product name");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Enter Product price");
			price = sc.nextDouble();
			
			input = "id = "+id+",  name = "+name+",  price = "+price;
	
			FileWriter fw = new FileWriter("//D:/Details/ProductDetails");
			
			fw.write(input+'n');
			
			System.out.println("Enter 1 if you want to add more product");
		}while(choice>0);
	}
}
