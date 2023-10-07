package com.sham.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import com.sham.config.DBConnection;
import com.sham.model.ProductBean;

public class DeleteDAO {
	private static final String TAG = DeleteDAO.class.getSimpleName();
	ProductBean pb = null;

	public int delete(HttpServletRequest req) {
		int update = 0;
		try {
			//make the connection
			Connection con = DBConnection.getConnection();
			
			//perform statement operation
			PreparedStatement statement = con.prepareStatement("delete from product31 where pcode= ?");
			int pcode = Integer.parseInt(req.getParameter("pcode"));
			//set parameter
			statement.setInt(1, pcode);
			
			 update = statement.executeUpdate();
			 if(update > 0) {
				 System.out.println("Deleted Successfully");
			 }
			
			
		} catch (Exception e) {
			System.out.println(TAG +" exception while delete record "+e.getLocalizedMessage());
		}
		return update;
	}
}
