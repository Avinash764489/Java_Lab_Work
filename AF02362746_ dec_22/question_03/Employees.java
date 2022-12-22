package question_03;

import java.util.Scanner;

public class Employees extends Member{

	private static String specialization;
	private static String department;
	
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, address;
		int age;
		Long phone_number;
		double salary;
		
		System.out.println("Enter employee name");
		name = sc.nextLine();
		System.out.println("Enter employee age");
		age = sc.nextInt();
		System.out.println("Enter employee phone number");
		phone_number = sc.nextLong();
		System.out.println("Enter employee address");
		sc.nextLine();
		address = sc.nextLine();
		System.out.println("Enter employee salary");
		salary = sc.nextDouble();
		System.out.println("Enter employee specialization");
		sc.nextLine();
		specialization = sc.nextLine();
		System.out.println("Enter employee department");
		department = sc.nextLine();
		System.out.println();
		System.out.println("--------------------------------------------------------"+'\n');
		System.out.println("Employee details"+'\n');
		Member m= new Member(name, age, phone_number, address, salary);
		Employees e = new Employees(specialization, department);
		System.out.println(m.toString());
		m.printSalary();
		System.out.println("specialization = "+e.specialization);
		System.out.println("department = "+e.department);
	}
	
	public Employees(String specialization,String department) {
		this.specialization = specialization;
		this.department = department;
	}
}
