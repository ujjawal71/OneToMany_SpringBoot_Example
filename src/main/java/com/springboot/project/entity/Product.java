package com.springboot.project.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;



@Entity
public class Product {

	
	@Id
	private int pid;
	private int qty;
	private int price;
	private String productname;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Product(int pid, int qty, int price, String productname) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.price = price;
		this.productname = productname;
	}




	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", qty=" + qty + ", price=" + price + ", productname=" + productname + "]";
	}
	
	

	
}
