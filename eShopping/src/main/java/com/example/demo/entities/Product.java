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
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prod_id;
	@Column
	private String prod_name;
	@Column
	private String prod_desc;
	@Column
	private double price;
	@Column
	private int qty;
	@OneToOne(cascade = CascadeType.ALL)//important
	@JoinColumn(name="cat_id")
	Category cat_id;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String prod_name, String prod_desc, double price, int qty, Category cat_id) {
		super();
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.price = price;
		this.qty = qty;
		this.cat_id = cat_id;
	}
	public Product(String prod_name, String prod_desc, double price, int qty) {
		super();
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.price = price;
		this.qty = qty;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_desc() {
		return prod_desc;
	}
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Category getCat_id() {
		return cat_id;
	}
	public void setCat_id(Category cat_id) {
		this.cat_id = cat_id;
	}


}
