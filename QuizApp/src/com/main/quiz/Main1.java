package com.main.quiz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main1 {

		public static void main(String[] args) {
			System.out.println("WELCOME TO QUIZ APP");
			Scanner sc=new Scanner(System.in);
			while (true) { 
				System.out.println("\n1. ADMIN MENU");
				System.out.println("2. STUDENT MENU");
				int c = sc.nextInt();
				
				if(c == 1) {
					try {
						Connection con = CP.createC();
						Statement smt=con.createStatement();
					System.out.println("ENTER ADMIN USERNAME : ");
					String Username = sc.next();
					
					System.out.println("ENTER ADMIN PASSWORD : ");
					String Password = sc.next();
					
					String q="Select * from Admin Where Username='"+Username+"' && Pass='"+Password+"'";
					ResultSet rs = smt.executeQuery(q);
					if(rs.next()) {
						System.out.println("Logging in.....");
						AdminOp.adminDB();
					}else {
						System.out.println("Please Enter Valid Username & Passsword");
						System.exit(0);
					}
					} catch (Exception e) {
				e.printStackTrace();
			}
		} if(c == 2) {
				Start.start();
		}
	}
}
}