package com.example.demomvc3;

import java.util.List;

public class Student {
private String firstname;
private String lastname;
private String email;
private String gender;
private List<String> plang;
private List<String> os;
private List<String> city;

public List<String> getCity() {
	return city;
}
public void setCity(List<String> city) {
	this.city = city;
}
public List<String> getOs() {
	return os;
}
public void setOs(List<String> os) {
	this.os = os;
}
public List<String> getPlang() {
	return plang;
}
public void setPlang(List<String> plang) {
	this.plang = plang;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
}
