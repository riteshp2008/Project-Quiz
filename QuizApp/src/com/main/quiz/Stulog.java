package com.main.quiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Stulog {
	public static void StuLogDB() {
			Scanner sc=new Scanner(System.in);{
			try {
				Connection con = CP.createC();
				Statement smt=con.createStatement();
				System.out.println("Enter User name : ");
				String Username = sc.next();
				System.out.println("Enter Password : ");
				String password = sc.next();
				String q="Select * from quiz Where Username='"+Username+"' && Pass='"+password+"'";
				ResultSet rs = smt.executeQuery(q);
				if(rs.next()) {
					System.out.println("Logging in.....");
					
					//Que
						Scanner input = new Scanner(System.in);
						int score = 0;
						System.out.println("Welcome to the Quiz Program!");
						
							// Question 1
							System.out.println("\nQue 1. Number of primitive data types in java are ?");
							System.out.println("a. 7");
							System.out.println("b. 8");
							System.out.println("c. 6");
							System.out.println("d. 9");
							String answer1 = input.nextLine().toLowerCase();
							if (answer1.equalsIgnoreCase("b")) {
								System.out.println("");
								score++;
							} else {
							}

							// Question 2
							System.out.println("\nQue 2. What is size of float and double ?");
							System.out.println("a. 32 and 32");
							System.out.println("b. 64 and 64");
							System.out.println("c. 32 and 64");
							System.out.println("d. 64 and 32");
							String answer2 = input.nextLine().toLowerCase();
							if (answer2.equalsIgnoreCase("c")) {
								System.out.println("");
								score++;
							} else {
							}

							// Question 3
							System.out.println("\nQue 3. Select the valid statement.");
							System.out.println("a. char[]ch =new char(5)");
							System.out.println("b. char[]ch =new char[5]");
							System.out.println("c. char[]ch =new char()");
							System.out.println("d. char[]ch =new char[]");
							String answer3 = input.nextLine().toLowerCase();
							if (answer3.equalsIgnoreCase("b")) {
								System.out.println("");
								score++;
							} else {
							}

							// Question 4
							System.out.println("\nQue 4. When an array is passed to a method, what does the method receive?");
							System.out.println("a. The reference of the array");
							System.out.println("b. A copy of the array");
							System.out.println("c. Length of the array");
							System.out.println("d. Copy of first element");
							String answer4 = input.nextLine().toLowerCase();
							if (answer4.equalsIgnoreCase("a")) {
								System.out.println("");
								score++;
							} else {
							}

							// Question 5
							System.out.println("\nQue 5. Select the valid statement to declare and initialize an array.");
							System.out.println("a. int[] A = {}");
							System.out.println("b. int[] A = (1,2,3)");
							System.out.println("c. int[] A = ()");
							System.out.println("d. int[] A = {1,2,3}");
							String answer5 = input.nextLine().toLowerCase();
							if (answer5.equalsIgnoreCase("d")) {
								System.out.println("");
								score++;
							} else {
							}

							// Question 6
							System.out.println("\nQue 6. Arrays in java are-");
							System.out.println("a. Object refrence");
							System.out.println("b. Objects");
							System.out.println("c. Primitive data type");
							System.out.println("d. None");
							String answer6 = input.nextLine().toLowerCase();
							if (answer6.equalsIgnoreCase("b")) {
								System.out.println("");
								score++;
							} else {
							}

							// Question 7
							System.out.println("\nQue 7. When is the object created with new keyword?");
							System.out.println("a. At run time");
							System.out.println("b. At comple time");
							System.out.println("c. Depends on the code");
							System.out.println("d. None");
							String answer7 = input.nextLine().toLowerCase();
							if (answer7.equalsIgnoreCase("a")) {
								System.out.println("");
								score++;
							} else {
							}

							// Question 8
							System.out.println("\nQue 8. In which of the following is toString() method defined?");
							System.out.println("a. java.lang.Object");
							System.out.println("b. java.lang.String");
							System.out.println("c. java.lang.util");
							System.out.println("d. None");
							String answer8 = input.nextLine().toLowerCase();
							if (answer8.equalsIgnoreCase("a")) {
								System.out.println("");
								score++;
							} else {
							}

							// Question 9
							System.out.println("\nQue 9. compareTo() returns");
							System.out.println("a. True");
							System.out.println("b. An int value");
							System.out.println("c. False");
							System.out.println("d. None");
							String answer9 = input.nextLine().toLowerCase();
							if (answer9.equalsIgnoreCase("b")) {
								System.out.println("");
								score++;
							} else {
							}

							// Question 10
							System.out.println("\nQue 10. Identify the return type of a method that does not return any value.");
							System.out.println("a. int");
							System.out.println("b. double");
							System.out.println("c. void");
							System.out.println("d. None");
							String answer10 = input.nextLine().toLowerCase();
							if (answer10.equalsIgnoreCase("c")) {
								System.out.println("");
								score++;
							} else {
							}
							int per = (100 * score)/10;
							System.out.println("Percentage : " +per+" \nYour Score was : "+score);
							if (per >= 90) {
								System.out.println("Grade : A+");
							} else if (per>70 && per <=80 ) {
								System.out.println("Grade : A");
							} else if (per>60 && per <=70 ) {
								System.out.println("Grade : B");
							} else if (per>50 && per <=60 ){
								System.out.println("Grade : C");
							} else if (per>=40 && per <=50 ){
								System.out.println("Grade : D");
							} else {
								System.out.println("You are fail...");
							}
						
					try {
						Connection c = CP.createC();
						PreparedStatement psmt = c.prepareStatement("Update quiz set Score='"+score+"' Where Username='"+Username+"' && Pass='"+password+"'");
						psmt.execute();
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("\nExit From Quiz : [YES/NO])");
					String a = sc.next();
					if (a.equalsIgnoreCase("yes")) {
						System.exit(0);
					}else{
						Start.start();
					}
				}else {
					System.out.println("Please Enter Valid Username & Passsword");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
}