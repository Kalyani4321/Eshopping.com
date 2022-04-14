package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shipper")
public class Shipper {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ship_id;
	@Column
	private String shipper_name;
	@Column
	private String city;
	@Column
	private String contact;
	
	@OneToOne(cascade = CascadeType.ALL)//important
	@JoinColumn(name="loginid")
	Login login;
	public Shipper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shipper(String sname, String city, String contact, Login login) {
		super();
		this.shipper_name = sname;
		this.city = city;
		this.contact = contact;
		this.login = login;
	}
	public int getShip_id() {
		return ship_id;
	}
	public void setShip_id(int ship_id) {
		this.ship_id = ship_id;
	}
	public String getShipper_name() {
		return shipper_name;
	}
	public void setShipper_name(String shipper_name) {
		this.shipper_name = shipper_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "Shipper [ship_id=" + ship_id + ", shipper_name=" + shipper_name + ", city=" + city + ", contact="
				+ contact + ", login=" + login + "]";

	}
}
	
	

