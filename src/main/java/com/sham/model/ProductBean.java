package com.sham.model;

import java.io.Serializable;

public class ProductBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pCode;
	private String pName;
	private float pPrice;
	private int pQty;
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getpPrice() {
		return pPrice;
	}
	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	@Override
	public String toString() {
		return "ProductBean [pCode=" + pCode + ", pName=" + pName + ", pPrice=" + pPrice + ", pQty=" + pQty + "]";
	}
	
	

}
