package question_01;

import java.util.Scanner; 

import java.util.*;


public class ContactBook {
	
	public static void main(String arg[]) {
		
		String name, email;
		String number;
		int ch;
		Scanner sc = new Scanner(System.in);
		Set<String> s = new TreeSet<>(); 
		 
		do {
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter mobile number");
		number = sc.next();
		System.out.println("Enter email");
		email = sc.next();
		s.add(name);
		s.add(number);
		s.add(email);
		System.out.println("If you want to add your friend details enter 0");
		System.out.println("Otherwise enter any number");
		ch = sc.nextInt();
		}while(ch<1);
		Iterator obj = s.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next()+"\t");
		}
		
	}
}
