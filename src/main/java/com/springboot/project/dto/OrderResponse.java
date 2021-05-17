package com.springboot.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {

	private String name;
	private String productname;
	private int id;
	
	
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public OrderResponse(String name, String productname) {
		super();
		this.name = name;
		this.productname = productname;
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
}
