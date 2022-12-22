package question_01;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, count=0;
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		if(num < 1) {
			System.out.println("Number must be in positive");
		}else if(num == 1) {
			System.out.println("Not prime number");
		}else if(num == 2) {
			System.out.println("Prime number");
		}else {
			for(int i=2; i<=(num/2); i++) {
				if(num%i==0) {
					count = 1;
					break;
				}
			}
			if(count == 0)
				System.out.println("Prime number");
			else
				System.out.println("Not a prime number");
		}
	}
}
