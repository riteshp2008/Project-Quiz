package com.main.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ConsGetSet {
		private String firstname;
		private String lastName; 
		private String username;
		private String password;
		private String city;
		private String email;
		private int mobileNumber;
		
		public static boolean InsertToRegDB(ConsGetSet rl) {
			try {
				Connection con = CP.createC();
				String q = "INSERT into quiz(Firstname,  LastName,  Username, Pass, City, Email, MobileNumber)values(?,?,?,?,?,?,?)";
				// PREPARED STATEMENT
				PreparedStatement psmt = con.prepareStatement(q);
				// SET VALUE OF PARAMETER
				psmt.setString(1, rl.getFirstname());
				psmt.setString(2, rl.getLastName());
				psmt.setString(3, rl.getUsername());
				psmt.setString(4, rl.getPassword());
				psmt.setString(5, rl.getCity());
				psmt.setString(6, rl.getEmail());
				psmt.setInt(7, rl.getMobileNumber());
				// EXECUTE
				psmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		} 	
		
		ConsGetSet() {
			
		}
		
		
		public String getFirstname() {
			return firstname;
		}


		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public int getMobileNumber() {
			return mobileNumber;
		}


		public void setMobileNumber(int mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		
		
public ConsGetSet(String firstname, String lastName, String username, String password, String city, String email,
				int mobileNumber) {
			super();
			this.firstname = firstname;
			this.lastName = lastName;
			this.username = username;
			this.password = password;
			this.city = city;
			this.email = email;
			this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "ConsGetSet [firstname=" + firstname + ", lastName=" + lastName + ", username=" + username + ", password="
			+ password + ", city=" + city + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
	}
}
