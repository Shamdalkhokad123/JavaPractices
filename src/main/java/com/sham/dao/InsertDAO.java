package com.sham.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import com.sham.config.DBConnection;
import com.sham.model.ProductBean;

public class InsertDAO {
	private static final String TAG = InsertDAO.class.getSimpleName();
	ProductBean pb =null;
	
	public int insert(HttpServletRequest req) {
		int update = 0;
		try {
			//fetch value from req object
			int pcode = Integer.parseInt(req.getParameter("pcode"));
			String pname = req.getParameter("pname");
			float price = Float.parseFloat(req.getParameter("pprice"));
			int pqty = Integer.parseInt(req.getParameter("pqty"));
			
			//making the connection
			Connection con = DBConnection.getConnection();
			
			//creating statement
			
			PreparedStatement st = con.prepareStatement("insert into praduct31 values(?,?,?,?)");
			st.setInt(1, pcode);
			st.setString(1, pname);
			st.setFloat(1, price);
			st.setInt(1, pqty);
			
			//perform operation
			 update = st.executeUpdate();
			
					
			
		} catch (Exception e) {
			System.out.println(TAG +" exception while inserting "+e.getLocalizedMessage());
			
		}
		
		return update ;
	}
}
