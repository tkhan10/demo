package com.tofek.spring.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("This is my first spring boot application.");
		SpringApplication.run(DemoApplication.class, args);
	}

}
