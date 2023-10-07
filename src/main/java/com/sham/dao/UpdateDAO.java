package com.sham.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import com.sham.config.DBConnection;

public class UpdateDAO {
	private static final String TAG = UpdateDAO.class.getSimpleName();
	
	public int update(HttpServletRequest req) {
		
		int k =0;
		
		try {
			//fetching request object value
			int pcode = Integer.parseInt(req.getParameter("pcode"));
		
			float price = Float.parseFloat(req.getParameter("pprice"));
			int pqty = Integer.parseInt(req.getParameter("pqty"));
			
			
			//making the connection
			Connection con = DBConnection.getConnection();
			
			//making the statement
			PreparedStatement st = con.prepareStatement("update product31 set pqty= ?, pprice=? where pcode = ?");
			
			//attach parameter
			st.setInt(1, pqty);
			st.setFloat(2, price);
			st.setInt(3, pcode);
			
			//execute the query
			k=st.executeUpdate();
		} catch (Exception e) {
			System.out.println(TAG +" exception while updating "+e.getLocalizedMessage());
		}
		return k;
	}
}
