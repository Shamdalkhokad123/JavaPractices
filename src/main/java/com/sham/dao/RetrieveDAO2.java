package com.sham.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sham.config.DBConnection;
import com.sham.model.ProductBean;

public class RetrieveDAO2 {
	private static final String TAG = RetrieveDAO2.class.getSimpleName();

	public ArrayList<ProductBean> retrieve() {
		ArrayList<ProductBean> pList = new ArrayList<>();
		ProductBean pb = null;
		try {

			// here we create connection object
			Connection con = DBConnection.getConnection();

			// Query to get the result
			PreparedStatement statement = con.prepareStatement("select * from product31");
			
			// to retrieve the result
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				pb = new ProductBean();
				pb.setpCode(resultSet.getInt(1));
				pb.setpName(resultSet.getString(2));
				pb.setpPrice(resultSet.getFloat(3));
				pb.setpQty(resultSet.getInt(4));
				pList.add(pb);
			}

		} catch (Exception e) {
			System.out.println(TAG + " exception while making connection " + e.getLocalizedMessage());
		}
		
		return pList;
	}
}
