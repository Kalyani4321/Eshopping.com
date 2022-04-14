package com.example.demo.entities;

import javax.persistence.Column;

public class CustomerRegister {
	private String name;
	private String email;
	private String contact;
	private String address;
	private String city;
	private String password;
	private String type;
	
	
	
	public CustomerRegister() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CustomerRegister(String name, String email, String contact, String address, String city,
			String password, String type) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.city = city;
		this.password = password;
		this.type = type;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
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
