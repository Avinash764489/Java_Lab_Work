package libraryManagementSystem.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entityClasses.Book;
import entityClasses.Students;

public class App {

	// Declare object of Scanner class
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int id = 0, ch, choice, stu_choice, stu_ch, exit = 0;

		Session s;

		// call connection function
		s = App.connection();

		System.out.println('\n' + "--*--*--*--*--Welcome to Library management system--*--*--*--*--*--");
		do {
			System.out.println('\n' + "Enter 1 For Registeration of a student");
			System.out.println("Enter 2 For Login");
			System.out.println("Enter 3 For Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			// Outer switch
			switch (choice) {

			case 1: {
				// call register function for registration
				App.register(s);
				break;
			}
			case 2: {
				// call login function for login
				id = App.login(s);
				// If condition to check username and password is valid or not
				if (id == 0) {
					System.out.println('\n' + "Invalid username and password");
				} else {
					do {
						System.out.println('\n' + "Enter 1 to display your details");
						System.out.println("Enter 2 to delete your account");
						System.out.println("Enter 3 to update your course");
						System.out.println("Enter 4 For Exit");
						System.out.println("Enter your choice");
						stu_choice = sc.nextInt();

						// Inner switch
						switch (stu_choice) {

						case 1: {
							// call display function to display all details
							App.display(s, id);
							break;
						}
						case 2: {
							// call delete function to delete the account
							App.delete(s, id);
							exit = 1;
							break;
						}
						case 3: {
							// call update function to update a student record
							App.update(s, id);
							break;
						}
						case 4: {
							// this is for exit from inner switch
							exit = 1;
							break;
						}
						default:
							System.out.println('\n' + "Your choice is invalid");
						}
						// ends of inner switch
						if (exit != 1) {
							System.out.println('\n' + "Enter 1 if you want to display/delete/update your details");
							stu_ch = sc.nextInt();
						} else {
							stu_ch = 0;
						}

					} while (stu_ch == 1);
				}
				// ends of if
				break;
			}

			case 3: {
				// This is for exit from program
				System.exit(0);
				break;
			}
			default:
				System.out.println('\n' + "Your chioce is invalid");
				System.exit(0);
			}
			// ends of outer switch

			System.out.println('\n' + "Enter 1 if you want register and login");
			ch = sc.nextInt();
		} while (ch == 1);
		s.close();
	}

	// connection function
	public static Session connection() {

		Configuration cfg = new Configuration().configure();
		cfg.addAnnotatedClass(Students.class);
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		return s;
	}
	// end of connection function

	// Register function for register a student record
	public static void register(Session s) {

		int book_id, num;
		String book_name, name, course, password;
		try {
			Transaction tr = s.beginTransaction();

			List<Book> list1 = new ArrayList<>();

			System.out.println('\n' + "Enter number of book you want to enter");
			num = sc.nextInt();
			for (int i = 1; i <= num; i++) {
				System.out.println('\n' + "Enter " + i + " book id");
				book_id = sc.nextInt();
				System.out.println("Enter " + i + " book name");
				sc.nextLine();
				book_name = sc.nextLine();
				Book book = new Book(book_id, book_name);
				list1.add(book);
				s.save(book);
			}
			System.out.println('\n' + "Enter student name");
			name = sc.next();
			System.out.println("Enter student course");
			course = sc.next();
			System.out.println("Enter student password");
			password = sc.next();
			Students s1 = new Students(1, name, course, password, list1);

			s.save(s1);

			tr.commit();
		} catch (Exception e) {
			System.out.println("Course id you entered is already present");
		}

	}
	// ends of register

	// display function to display student details
	public static void display(Session s, int id) {

		Query q = s.createQuery("from Students where id = '" + id + "'");
		List<Students> l = q.list();
		for (Students a : l) {
			id = a.getId();
			List<String> list = new ArrayList<>();
			for (Book b : a.getBook_id()) {
				list.add("Book_id = " + b.getId() + "   book = " + b.getBook_name());
			}
			System.out.println('\n' + "---------------------------Student details------------------------" + '\n');
			System.out.println("Id = " + a.getId());
			System.out.println("name = " + a.getName());
			System.out.println("Course = " + a.getCourse());
			System.out.println(list);
		}

	}
	// ends of display function

	// login function
	public static int login(Session s) {

		String name, password;
		int id = 0;

		System.out.println('\n' + "Enter student name");
		name = sc.next();
		System.out.println("Enter password");
		password = sc.next();

		Query q = s.createQuery("from Students where name = '" + name + "' and password = '" + password + "'");
		List<Students> l = q.list();
		for (Students a : l) {
			id = a.getId();

		}
		return id;

	}
	// ends of login function

	// delete function
	public static void delete(Session s, int id) {

		Transaction tr = s.beginTransaction();
		Students stu = s.get(Students.class, id);
		s.delete(stu);

		tr.commit();
		System.out.println('\n' + "Your account is now deleted");
	}
	// ends of delete function

	// Update function
	public static void update(Session s, int id) {

		String course, book_name, name, pass;
		int num, book_id;

		Transaction tr = s.beginTransaction();
		Students stu = s.get(Students.class, id);

		// update student course
		System.out.println('\n' + "Enter new course");
		course = sc.next();
		stu.setCourse(course);
		// end of update course

//		// update student name
//		System.out.println('\n' + "Enter your new name");
//		name = sc.next();
//		stu.setName(name);
//		// end of update name

//		// update student password
//		System.out.println('\n' + "Enter your new password");
//		pass = sc.next();
//		stu.setPassword(pass);
//		// end of update name

//		// update books
//		try {
//			List<Book> list = new ArrayList<>();
//			System.out.println('\n' + "Enter number of book you want to enter");
//			num = sc.nextInt();
//			for (int i = 1; i <= num; i++) {
//				System.out.println('\n' + "Enter " + i + " book id");
//				book_id = sc.nextInt();
//				System.out.println("Enter " + i + " book name");
//				sc.nextLine();
//				book_name = sc.nextLine();
//				Book book = new Book(book_id, book_name);
//				list.add(book);
//				s.save(book);
//			}
//			stu.setBook_id(list);
//		} catch (Exception e) {
//			System.out.println("course id you entered is already present");
//		}
//		// end of update book

		s.save(stu);
		tr.commit();
		System.out.println('\n' + "Your details is updated");
	}
	// ends of update function
}
