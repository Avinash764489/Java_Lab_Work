package question_02;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, remender, new_num=0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		if(num<1) {
			System.out.println("Your number must be in positive");
		}else if(num<10) {
			System.out.println("Palindrome number");
		}else {
			for(int i=num; i>0;i=i/10) {
				remender = i%10;
				new_num = (new_num*10)+remender;
			}
			System.out.println(new_num);
			if(num==new_num) {
				System.out.println("Palindrome number");
			}else {
				System.out.println("Not a palindrome number");
			}
		}
	}
}
