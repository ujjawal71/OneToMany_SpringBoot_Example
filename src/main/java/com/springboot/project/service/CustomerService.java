package com.springboot.project.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.entity.Customer;
import com.springboot.project.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerService  customerService; 
	
	
	
	// save data
		public Customer  savePlaceOrder(Customer customer ) {
			return customerRepository.save(customer);
		}
		
		//get all Data 
		public Customer getAllOrderById(int id) {
			Customer customer  = null;
			try {
				customer = this.customerRepository.findById(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return customer;
		}
		
		//product list
		public HashMap<String, Object> getProductById(int id)  {
			Customer productdatabyid = null;
			HashMap<String, Object> map = new HashMap<>();
			try {
				productdatabyid = this.customerRepository.findById(id);

			} catch (Exception e) {
				e.printStackTrace();
			}
			 
			 map.put("productname", productdatabyid.getProducts() );
			return map;
			
			
		}

	
	
	
}
