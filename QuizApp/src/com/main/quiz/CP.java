  package com.main.quiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

	static Connection con;

	public static Connection createC() throws Exception {
		try {
			// LOAD DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
			// CREATE CONNECTION

			String user = "root";
			String password = "Ritesh2008";
			String url = "jdbc:mysql://localhost:3306/jdbc"; //GIVE QUEARY SCHEMA NAME

			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}