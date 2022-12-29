package question_05;

import java.util.Arrays;
import java.util.Scanner;

public class GreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number of element");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter "+num+" number");
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Maximum number is :- "+arr[num-1]);
	}

}
