package com.samco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTaskApplication.class, args);
		System.out.println("Server Created Succesfully");
	}

}
