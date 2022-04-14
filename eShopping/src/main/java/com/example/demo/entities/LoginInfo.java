package com.example.demo.entities;

public class LoginInfo {
String useremail;
String password;
public LoginInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public LoginInfo(String username, String password) {
	super();
	this.useremail = username;
	this.password = password;
}
public String getUsername() {
	return useremail;
}
public void setUsername(String username) {
	this.useremail = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
