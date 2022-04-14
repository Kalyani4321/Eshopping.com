package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CustomerService;

@CrossOrigin (origins = "http://localhost/3000")
@RestController
public class CustomerController {
	@Autowired
	CustomerService cservice;
	
	/*@GetMapping("/checklogin")
	public String checkLogin(@RequestParam ("username") String username,@RequestParam ("password") String password)
	{
			return cservice.getLogin(username, password);
		
		

	}*/
}
