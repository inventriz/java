package com.tridib.inventriz.boot.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tridib.inventriz.boot.model.Greeting;

@RestController
@EnableAutoConfiguration
public class HelloController {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
	
	@RequestMapping("/")
	String getHome(){
		System.out.println("Calling the getHome method updated");
		return "Hello World";
	}
	
	public static void main(String args[]){
		SpringApplication.run(HelloController.class, args);
	}

}
