package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.entities.Product;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.ProductsService;
import com.example.demo.services.ShipperService;

@CrossOrigin (origins = "http://localhost/3000")
@RestController
public class HomeController {
	@Autowired
	LoginService lservice;
	@Autowired
	CustomerService cservice;
	@Autowired
	ProductsService pservice;
	@Autowired
	ShipperService sservice;
	
	
	
}
