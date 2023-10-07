package com.sham.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import com.sham.config.DBConnection;
import com.sham.model.ProductBean;

public class RetrieveDAO {
	private static final String TAG = RetrieveDAO.class.getSimpleName();
	ProductBean pb = null;
	public ProductBean retrieve(HttpServletRequest req) {
		try {
			
			//here we create connection object
			Connection con = DBConnection.getConnection();
			
			//Query to get the result
			PreparedStatement statement = con.prepareStatement("select * from product31 where pcode = ?");
			int pcode = Integer.parseInt(req.getParameter("pcode"));
			statement.setInt(1, pcode);
			
			//to retrieve the result
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next()) {
				pb = new ProductBean();
				pb.setpCode(resultSet.getInt(1));
				pb.setpName(resultSet.getString(2));
				pb.setpPrice(resultSet.getFloat(3));
				pb.setpQty(resultSet.getInt(4));
				
			}
			
		} catch (Exception e) {
			System.out.println(TAG +" exception while making connection "+e.getLocalizedMessage());
		}
		return pb;
	}
}
