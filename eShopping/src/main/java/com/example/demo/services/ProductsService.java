package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Product;
import com.example.demo.entities.Shipper;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductsService {
	@Autowired
	ProductRepository prepo;
	@Autowired
	CategoryRepository catrepo;
	public List<Product> getproducts() {
		return prepo.findAll();
		
	}
	public List<Product> searchProduct( String product) {
		return prepo.searchProduct(product);
		
	}
	
//	public List<Product> CategoryProducts( String category) {
//		return prepo.CategoryProducts(category);
//		
//	}
	public List<Category> getProductsCategory() {
		return catrepo.findAll();
		
	}
}
