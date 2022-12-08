package question_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {
 
	public static void main(String arg[]) {
		
		Scanner sc =new Scanner(System.in);
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1,"Amit");
		hm.put(2, "Sonali");
		hm.put(3, "Sonu");
		hm.put(4, "Sumit");
		hm.put(5, "Anshu");
		hm.put(6, "Anil");
		hm.put(7, "Aarushi");
		
		System.out.println("Enter id of members");
		Integer num = sc.nextInt();
		for(Map.Entry m : hm.entrySet()) {
			if(m.getKey()==num) {
				System.out.println(m.getValue());
			}
		}
		
	}
}
