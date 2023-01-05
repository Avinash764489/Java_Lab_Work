package question_01;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class Records {

	public static void main(String arg[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		Hashtable<String, String> table = new Hashtable<>();
		
		String name, number;
		int num;
		
		try (FileWriter is = new FileWriter("D:/Records.txt")) {
			is.write("Name"+'\t'+"Number");
			System.out.println("Enter the number of records you want to enter");
			num = sc.nextInt();
			for(int i=0; i<num; i++) {
				System.out.println("Enter Student name");
				name = sc.next();
				System.out.println("Enter Student number");
				number = sc.next();
				table.put(name, number);
				is.write(name+'\t'+number+'\n');
				
			}
			System.out.println('\n'+"Your "+num+" records are"+'\n');
			System.out.println(table);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	}
}
