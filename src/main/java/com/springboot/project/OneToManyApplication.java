package com.springboot.project;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class OneToManyApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
		System.out.println("hello world ");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OneToManyApplication.class);
	}

}
