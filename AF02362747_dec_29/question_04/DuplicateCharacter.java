package question_04;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int count;
		String str1, str2=" ";
		
		System.out.println("Enter a string");
		str1 = sc.nextLine();
		char string[] = str1.toCharArray();
		System.out.println("Duplicate characters in a given string: ");
		for(int i = 0; i < string.length; i++) {
			count = 1;
			for(int j = i+1; j < string.length; j++) {
				if(string[i] == string[j] && string[i] !=' ') {
					count++;
					string[j] = '0';
				}
			}
			if(count > 1 && string[i] != '0')
				System.out.print(string[i]);
		}
		
	}
}
