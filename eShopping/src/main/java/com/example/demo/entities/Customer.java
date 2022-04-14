package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_id;
	@Column
	private String cust_name;
	@Column
	private String email;
	@Column
	private String contact;
	@Column
	private String address;
	@Column
	private String city;
	@OneToOne(cascade = CascadeType.ALL)//important
	@JoinColumn(name="loginid")
	Login login;
	
	
	
	public Customer() {
		super();
	}
	


	public Customer( String cust_name, String email, String contact, String address, String city,
			Login login_id) {
		super();
		this.cust_name = cust_name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.city = city;
		this.login = login_id;
	}



	public Customer(String cust_name, String email, String contact, String address, String city) {
		super();
		this.cust_name = cust_name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.city = city;
	}



	public int getCust_id() {
		return cust_id;
	}



	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}



	public String getCust_name() {
		return cust_name;
	}



	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
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



	public Login getLoginid() {
		return login;
	}



	public void setLoginid(Login login_id) {
		this.login = login_id;
	}



	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", email=" + email + ", contact=" + contact
				+ ", address=" + address + ", city=" + city + ", login_id=" + login + "]";
	}
	
	

}
