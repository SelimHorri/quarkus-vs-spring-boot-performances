package com.selimhorri.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = {"/hello"})
public class SpringPerformanceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringPerformanceApplication.class, args);
	}
	
	@GetMapping
	public String hello() {
		return "Hello Spring Boot !!";
	}
	
	
	
}







