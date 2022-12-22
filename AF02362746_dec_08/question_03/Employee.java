package question_03;

import java.util.*;

public class Employee {

	String name;
	int workYear;
	double salary;
	
	public Employee(String name, int workYear, double salary ) {
		super();
		this.name = name; 
		this.workYear = workYear;
		this.salary = salary;
	}
	
	public static void main(String arg[]) {
		List<Employees> e = new ArrayList<>();
		e.add(new Employees("Amit", 4, 78955.00));
		e.add(new Employees("Shital", 9, 45678.00));
		e.add(new Employees("Anshu", 2, 67956.00));
		e.add(new Employees("Rohit", 7, 34545.00));
		e.add(new Employees("Ramesh", 1, 56576.00));
		e.add(new Employees("Ajay", 2, 24344.00));
		e.add(new Employees("Akash", 5, 678787.00));
		
		double s = 0; 
		System.out.println(" name"+"\t"+"working year"+"\t"+" salary" );
		System.out.println();
		for(Employees s1:e) {
			if(s1.workYear>2) {
				s = s1.salary+(s1.salary/10);
			}
			else
				s = s1.salary;
			System.out.print(s1.name+"\t\t");
			System.out.print(s1.workYear+"\t");
			System.out.println(s);
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", workYear=" + workYear + "]";
	}
}
