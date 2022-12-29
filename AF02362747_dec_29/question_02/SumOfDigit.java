package question_02;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, sum=0;
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		for(int i = num; i > 0; i = i/10) {
			
			sum = sum+i%10;
		}
		System.out.println("Sum of digit of "+num+" is "+sum);
	}
}
