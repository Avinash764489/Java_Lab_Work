package com.hibernet.hibernetHQL;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import one_to_many.Subject;
import one_to_one.Course;
import one_to_one.Students;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		App.insert(s);
//		App.display(s);

	}

	public static void insert(Session s) {

		Transaction tr = s.beginTransaction();

		Course c1 = new Course(1, "IT");
		Course c2 = new Course(2, "BCA");
		Course c3 = new Course(3, "BCM");
		Course c4 = new Course(4, "BBA");
		Course c5 = new Course(5, "MCA");

		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);
		s.save(c5);

		Subject s1 = new Subject(1, "C");
		Subject s2 = new Subject(2, "C++");
		Subject s3 = new Subject(3, "JAVA");
		Subject s4 = new Subject(4, "PYTHON");
		Subject s5 = new Subject(5, ".NET");
		Subject s6 = new Subject(6, "PHP");
		Subject s7 = new Subject(7, "C#");

		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		s.save(s5);
		s.save(s6);
		s.save(s7);

		Set<Subject> list1 = new HashSet<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		list1.add(s6);

		Set<Subject> list2 = new HashSet<>();
		list2.add(s1);
		list2.add(s2);
		list2.add(s3);
		list2.add(s4);

		Set<Subject> list3 = new HashSet<>();
		list3.add(s1);
		list3.add(s2);
		list3.add(s3);
		list3.add(s4);
		list3.add(s5);
		list3.add(s6);
		list3.add(s7);

		Students stu1 = new Students(1, 2, "Avinash", c1, list1);
		Students stu2 = new Students(2, 32, "Monu", c5, list1);
		Students stu3 = new Students(3, 45, "Aman", c3, list1);
		Students stu4 = new Students(4, 12, "Kundan", c4, list2);
		Students stu5 = new Students(5, 67, "Anil", c2, list3);

		s.save(stu1);
		s.save(stu2);
		s.save(stu3);
		s.save(stu4);
		s.save(stu5);
		tr.commit();
	}

	public static void display(Session s) {

		Students stu = s.get(Students.class, 4);
		System.out.println(stu);
	}
}
