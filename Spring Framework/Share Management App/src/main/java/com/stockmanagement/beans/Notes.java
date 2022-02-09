package com.stockmanagement.beans;  
  
public class Notes {  
	public Notes() {
		System.out.println("BEAN > NOTES.BEAN.java < INITILIZED FOR *GETTERS AND SETTERS*");	
	}
	
private int id;  
private String name;  
private String subject;  
private String description;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}  
  
  
  
}  