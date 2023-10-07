package com.sham.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String TAG = DBConnection.class.getSimpleName(); 
	private static  Connection con = null;

	private DBConnection() {
		
	}
	static {
		try {
			Class.forName("com.mysql.jdbc.driver");
			String url = "jdbc:mysql://localhost:3306/organization";
			String pass = "root";
			String uname = "root";
			
			con = DriverManager.getConnection(url, uname, pass);
		} catch (Exception e) {
			System.out.println(TAG + " Exception while making connection");
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
}
