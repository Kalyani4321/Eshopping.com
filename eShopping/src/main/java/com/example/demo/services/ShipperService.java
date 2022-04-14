package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Shipper;
import com.example.demo.repositories.ShipperRepository;

@Service
public class ShipperService {

	@Autowired
	ShipperRepository srepo;
	
	public Shipper getShipperInfo(int id) {
		return srepo.getById(id);
		
	}
	
	public Shipper addshipper(Shipper s) {
		return srepo.save(s);
		
	}
	public int getShipperByCity(String city) {
		return srepo.getByCity(city);

	}
}
