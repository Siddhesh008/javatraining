package com.example.demoasg1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
private String username;
private String password;
private String email;
public Employee() {
	
}
public Employee(String username, String password, String email) {
	super();
	this.username = username;
	this.password = password;
	this.email = email;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
