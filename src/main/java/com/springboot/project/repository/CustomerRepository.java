package com.springboot.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.project.dto.OrderResponse;
import com.springboot.project.entity.Customer;
import com.springboot.project.entity.Product;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	
	 public Customer findById(int id);
	
//jpa query no sql join query ,jpa query is case insensitive but not sql query
	@Query("SELECT new com.springboot.project.dto.OrderResponse ( c.name , p.productname ) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();
	
}
