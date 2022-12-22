package question_04;

public class Rectangle {

	private double length;
	private double breadth;
	
	public void area() {
		System.out.println("Area of Rectangle = "+(length*breadth));
	}
	
	public void perimeter() {
		System.out.println("Parimeter of Rectangle = "+(2*(length+breadth)));
	}
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
}
