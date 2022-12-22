package question_04;

public class Square extends Rectangle{

	private double side;
	
	public void area() {
		System.out.println("Area of Square = "+(side*side));
	}
	
	public void perimeter() {
		System.out.println("Parimeter of Square = "+(4*side));
	}

	public Square(double length, double breadth, double side) {
		super(length, breadth);
		super.area();
		super.perimeter();
		this.side = side;
	}

}
