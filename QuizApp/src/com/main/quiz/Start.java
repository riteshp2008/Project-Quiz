package com.main.quiz;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Start {
	
	public Start(String firstName, String LastName, String Username, String password, String City, String Email, int MobileNumber) {
	}

	public static void start() throws SQLException {
		System.out.println("-----HELLO STUDENT-----");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n1. Student Registration");
			System.out.println("2. Student Login");
			System.out.println("3. Exit Application");
			int c = sc.nextInt();

			if (c == 1) {
				// Registration
				System.out.println("Enter your First Name : ");
				String Firstname = sc.next();

				System.out.println("Enter your Last Name : ");
				String LastName = sc.next();

				System.out.println("Enter your Username : ");
				String Username = sc.next();

				System.out.println("Enter your Password : ");
				String password = sc.next();

				System.out.println("Enter your City : ");
				String City = sc.next();

				System.out.println("Enter your Email : ");
				String Email = sc.next();

				System.out.println("Enter your Mobile number : ");
				int MobileNumber = sc.nextInt();

				// CREATE rl OBJECT TO STORE Registration Data
				ConsGetSet rl = new ConsGetSet(Firstname, LastName, Username, password, City, Email, MobileNumber);
				boolean answer = ConsGetSet.InsertToRegDB(rl);
				if (answer) {
					System.out.println("Record Inserted");
				} else {
					System.out.println("Somthing went worng record not inserted");
				}
				System.out.println(rl);

			} else if (c == 2) {
				Stulog.StuLogDB();
			}

			if (c >= 3) {
				// EXIT APP
				System.out.println("------Have a nice day------");
				System.exit(0);
			} else {

			}
		}
	}
}