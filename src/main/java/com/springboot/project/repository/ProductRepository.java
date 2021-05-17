package com.springboot.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.springboot.project.dto.OrderResponse;
import com.springboot.project.entity.Customer;
import com.springboot.project.entity.Product;


public interface ProductRepository extends JpaRepository<Product,Integer> {

	
	 public Product findById(int id);
	

}
