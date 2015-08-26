package com.tridib.inventriz.boot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
	
	@RequestMapping("/")
	String getHome(){
		System.out.println("Calling the getHome method updated");
		return "Hello World";
	}
	
	public static void main(String args[]){
		SpringApplication.run(HelloController.class, args);
	}

}
