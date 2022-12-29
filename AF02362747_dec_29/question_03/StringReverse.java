package question_03;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str;
		str = sc.nextLine();
		System.out.println("Reversed string is ");
		for(int i = (str.length()-1); i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
