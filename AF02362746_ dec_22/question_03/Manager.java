package question_03;

import java.util.Scanner;

public class Manager extends Member{

	private static String specialization;
	private static String department;
	
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, address;
		int age;
		Long phone_number;
		double salary;
		
		System.out.println("Enter manager name");
		name = sc.nextLine();
		System.out.println("Enter manager age");
		age = sc.nextInt();
		System.out.println("Enter manager phone number");
		phone_number = sc.nextLong();
		System.out.println("Enter manager address");
		sc.nextLine();
		address = sc.nextLine();
		System.out.println("Enter manager salary");
		salary = sc.nextDouble();
		System.out.println("Enter manager specialization");
		sc.nextLine();
		specialization = sc.nextLine();
		System.out.println("Enter manager department");
		department = sc.nextLine();
		System.out.println();
		System.out.println("--------------------------------------------------------"+'\n');
		System.out.println("Manager details"+'\n');
		Member m= new Member(name, age, phone_number, address, salary);
		Manager e = new Manager(specialization, department);
		System.out.println(m.toString());
		m.printSalary();
		System.out.println("specialization = "+e.specialization);
		System.out.println("department = "+e.department);
	}
	
	public Manager(String specialization,String department) {
		this.specialization = specialization;
		this.department = department;
	}
}
