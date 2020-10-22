package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@RequestMapping(value = "/")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/input")
	public String teste(){
		return "Hello World";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/input2")
	public String teste1(){
		return "Hello World";
	}
}
