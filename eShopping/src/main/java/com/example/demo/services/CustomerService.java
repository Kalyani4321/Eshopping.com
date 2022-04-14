package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Product;
import com.example.demo.entities.Shipper;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.repositories.ShipperRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository crepo;
	
	@Autowired
	ShipperRepository srepo;
	@Autowired
	ProductRepository prepo;
	public Customer addcustomer(Customer c) {
		return crepo.save(c);
		
	}
	public Shipper addshipper(Shipper c) {
		return srepo.save(c);
		
	}
	
	public List<Product> getproducts() {
		return prepo.findAll();
		
	}
	
	public Customer getcustInfo(int id) {
		return crepo.getById(id);
		
	}
	
	/*public String getLogin( String username, String password) {
		return crepo.checkLogin(username,password);
		
	}*/
	
	
}
