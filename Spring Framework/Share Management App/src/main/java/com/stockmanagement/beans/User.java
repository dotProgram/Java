package com.stockmanagement.beans;  
 


public class User {  
	public User() {
		System.out.println("SpringMVC-JDBC-2 Bean User got initilized... = Getters and Setters of User Database Table \n");	
		}
	
private int id; 
private String role;  
private String firstN;
private String lName;  
private String userid;  
private String password;  
private String email;  
private int phno;  

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getFirstN() {
	return firstN;
}
public void setFirstN(String firstN) {
	this.firstN = firstN;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}

  
}  