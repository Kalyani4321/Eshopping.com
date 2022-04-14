package com.example.demo.controllers;
import com.example.demo.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.entities.Customer;
import com.example.demo.entities.CustomerRegister;
import com.example.demo.entities.Login;
import com.example.demo.entities.LoginInfo;
import com.example.demo.entities.Order;
import com.example.demo.entities.Product;
//import com.example.demo.entities.Shipper;
import com.example.demo.entities.Shipper;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.OrderService;
import com.example.demo.services.ProductsService;
//import com.example.demo.services.ShipperService;
import com.example.demo.services.ShipperService;

@CrossOrigin (origins = "http://localhost/3000")
@RestController
public class LoginController {

	@Autowired
	LoginService lservice;
	@Autowired
	OrderService oservice;
	@Autowired
	CustomerService cservice;
	@Autowired
	ProductsService pservice;
	@Autowired
	ShipperService sservice;
	
	@PostMapping("/registercust")
	public Customer registerCustomer(@RequestBody CustomerRegister cr)
	{	
		Login l = new Login(cr.getEmail(), cr.getPassword(),cr.getType());
				Login inserted = lservice.add(l);
				System.out.println(cr.getEmail());
				
		Customer c = new Customer(cr.getName(),cr.getEmail(),cr.getContact(),cr.getAddress(),
        cr.getCity(),inserted);
		System.out.println(cr.getName());
	
		return cservice.addcustomer(c);		
	}
	
	@GetMapping("/getAllCategory")
	public List<Category> getProductCategory()
	{
		return pservice.getProductsCategory();
	}
	
	@GetMapping("/allproducts")
	public List<Product> getProducts()
	{
		return cservice.getproducts();
	}
	
	@PostMapping("/registership")
	public Shipper registerShipper(@RequestBody CustomerRegister cr)
	{
		Login l = new Login(cr.getEmail(), cr.getPassword(),cr.getType());
				Login inserted = lservice.add(l);
		Shipper s = new Shipper(cr.getName(),cr.getCity(),cr.getContact(),inserted);
	    return cservice.addshipper(s);
	}
	
	@PostMapping("/checklogin")
	public Object checkLogin(@RequestBody Login l)
	{
			return (Object)lservice.getLoggedInUserInfo(l.getUseremail(), l.getPassword()) ;		
	}
	
	@GetMapping("/admin/getorders")
	public List<Order> getOrders()
	{
			return oservice.getOrders() ;
			
	}
	
	@GetMapping("/customer/getOrderDetails")
	public List<Order> getOrderDetails()
	{
			return oservice.getOrders() ;
			
	}
	
	@PostMapping("/order")
	public Order placeOrder (@RequestBody Order o)
	{	
	    int custid= o.getCust_id();
	   Customer customer = cservice.getcustInfo(custid);
	   
		int ship_id= sservice.getShipperByCity(customer.getCity());
		Shipper shipper = (Shipper) sservice.getShipperInfo(ship_id);
				String orderdate;
				
					orderdate = o.getOrderdate().toString();
					Order order = new Order(o.getAmount(),o.getStatus(),orderdate,o.getDeliverydate(),
					        o.getCust_id(),ship_id, customer,shipper);

				
		return oservice.addOrder(order);		
	}/*
	@GetMapping("/changepassword")
	public void changepassword(@RequestParam ("password") String password, @RequestParam ("useremail") String useremail)
	{
		lservice.changePassword(password,useremail);
	}
	@PostMapping("/changepassword")
	public void changepassword1(@RequestBody Login l)
	{
		lservice.changePassword(l.getPassword(), l.getUseremail());
	}
	@GetMapping("/checkpassword")
	public String checkPassword(String useremail)
	{
		return lservice.checkPassword(useremail);
	}
	@PostMapping("/checkpassword")
	public String checkPassword1(String useremail) {
		return lservice.checkPassword(useremail);
	}
	*/
}
