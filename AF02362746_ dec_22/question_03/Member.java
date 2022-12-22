package question_03;

public class Member {

	private String name;
	private int age;
	private long phone_nummber;
	private String address;
	private double salary;
	public Member(String name, int age, long phone_nummber, String address, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phone_nummber = phone_nummber;
		this.address = address;
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("Salary = "+salary);
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "name=" + name +'\n'+"age=" + age + '\n'+"phone_nummber=" + phone_nummber + '\n'+"address=" + address;
	}
}
