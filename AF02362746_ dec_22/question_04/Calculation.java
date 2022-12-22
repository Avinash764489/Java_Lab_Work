package question_04;

import java.util.Scanner;

public class Calculation{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double length, breadth, side;
		
		System.out.println("Enter the length of Rectangle");
		length = sc.nextDouble();
		System.out.println("Enter the breadth of Rectangle");
		breadth = sc.nextDouble();
		System.out.println("Enter the length of Square");
		side = sc.nextDouble();
		
		Square sq = new Square(length, breadth, side);
		sq.area();
		sq.perimeter();
	}

}
