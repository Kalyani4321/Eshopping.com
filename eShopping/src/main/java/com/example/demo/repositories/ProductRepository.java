package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Login;
import com.example.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("select p from Product p where p.prod_name like %?1%")
	 public List<Product> searchProduct(String product);
	 
//	@Query("select p from Product p, Category c where p.cat_id =c.catid and catname%?1%")
//	 public List<Product> searchProduct(String product);
//	 
}
