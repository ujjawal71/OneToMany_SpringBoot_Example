package com.springboot.project.controller;

import java.util.HashMap;
import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.project.dto.OrderResponse;
import com.springboot.project.entity.Customer;
import com.springboot.project.entity.Product;
import com.springboot.project.repository.CustomerRepository;
import com.springboot.project.repository.ProductRepository;
import com.springboot.project.service.CustomerService;



@RestController
public class CustomerController {

	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CustomerService  customerService; 
	
	
	/*@PostMapping("/placeOrder")
	public Customer placeorder(@RequestBody OrderRequest request)
	{
		return customerRepository.save(request.getCustomer());
	}*/
	
	
	@PostMapping("/placeOrder")
	public Customer placeorder(@RequestBody Customer customer) {
		return customerService.savePlaceOrder(customer);
		
	}
	
	
	
	@GetMapping("/findAllOrder/{id}")
	public Customer getAllOrderById(@PathVariable("id") int id)
	{
		return customerService.getAllOrderById(id);
	}
	
	
	@GetMapping("/productById/{id}")
	public HashMap<String, Object>  getProductById(@PathVariable("id") int id)
	{
		return customerService.getProductById(id);
	}
	
	
	/*
	@GetMapping("/findAllOrder")
	public List<Customer> findAllOrder()
	{
		return customerRepository.findAll();
	}*/
	
	
	
		@GetMapping("/getInFo")
	public List<OrderResponse> getJoinInfo()
	{
		return customerRepository.getJoinInformation();
	}
	
/*	@GetMapping("/getInFo")
	public List<Product> getJoinInfo()
	{
		return customerRepository.getJoinInformation();
	}*/
}
