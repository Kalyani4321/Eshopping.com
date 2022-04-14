package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="login")
public class Login {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 int loginid;
@Column
 String useremail;
@Column
 String password;
@Column
 String type;

public Login() {
	super();
	// TODO Auto-generated constructor stub
}

public Login(String useremail, String password, String type) {
	super();
	this.useremail = useremail;
	this.password = password;
	this.type = type;
}


public int getLoginid() {
	return loginid;
}
public void setLoginid(int login_id) {
	this.loginid = login_id;
}
public String getUseremail() {
	return useremail;
}
public void setUseremail(String useremail) {
	this.useremail = useremail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


}
