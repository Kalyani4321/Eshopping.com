package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Shipper;
@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Integer> {
	@Query("select s.ship_id from Shipper s where s.city = ?1")
	  public int getByCity(String city);

}
