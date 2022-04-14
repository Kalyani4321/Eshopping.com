package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.entities.Shipper;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.ShipperRepository;

@Service
public class LoginService {
    @Autowired
	LoginRepository lrepo;
	
    @Autowired
    CustomerRepository crepo;
    @Autowired
    ShipperRepository srepo;
    
	public Login add(Login l)
	{
		return lrepo.save(l);
	}
	
	public Object getLoggedInUserInfo(String uemail, String pwd) {
		Login info = lrepo.getInfoByNameAndPassword(uemail, pwd);
		//System.out.println(info);
		if(info!=null) {
		if(info.getType() == "customer") {
			int id = info.getLoginid();
			return (Object) crepo.getById(id);
		}else if (info.getType() == "shipper") {
			int id = info.getLoginid();
			return (Object) srepo.getById(id);
		}else {
			System.out.println(info);
			
			return (Object) info;
			
		}
		}
		else
			return null;
	}
	/*
	public void changePassword(String password, String useremail)
	{
		lrepo.changePassword(password,useremail);
	}
	public String checkPassword(String useremail)
	{
		return lrepo.checkPassword(useremail);
	}
	*/
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
