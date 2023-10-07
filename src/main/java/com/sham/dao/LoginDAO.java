package com.sham.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import com.sham.config.DBConnection;

public class LoginDAO {
	private static final String TAG = LoginDAO.class.getSimpleName();
	
	public String login(HttpServletRequest req) {
		
		 String fName = null;
		 
		 try {
			//get the request required value
			 String uname = req.getParameter("uname");
			 String pass = req.getParameter("pass");
			 
			 //making the connection
			 Connection con = DBConnection.getConnection();
			 
			 //making statement 
			 PreparedStatement st = con.prepareStatement("select * from userreg31 where uname = ? and pass= ?");
			 
			 //attach all the parameter
			 st.setString(1, uname);
			 st.setString(2, pass);
			 
			 //execute the query
			 ResultSet rs = st.executeQuery();
			 
			 if(rs.next()) {
				 fName = rs.getString(4);
			 }
			 
		} catch (Exception e) {
			System.out.println(TAG + " exception while login "+e.getLocalizedMessage());
		}
		 
		 return fName;
	}
}
