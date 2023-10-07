package com.sham.model;

public class UserReg31 {
private int userid ;
private String uname ;
private String pass;
private String fname;
private String lname ;
private int mobile;
public UserReg31() {
	super();
	// TODO Auto-generated constructor stub
}
public UserReg31(int userid, String uname, String pass, String fname, String lname, int mobile) {
	super();
	this.userid = userid;
	this.uname = uname;
	this.pass = pass;
	this.fname = fname;
	this.lname = lname;
	this.mobile = mobile;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "UserReg31 [userid=" + userid + ", uname=" + uname + ", pass=" + pass + ", fname=" + fname + ", lname="
			+ lname + ", mobile=" + mobile + "]";
}


}
