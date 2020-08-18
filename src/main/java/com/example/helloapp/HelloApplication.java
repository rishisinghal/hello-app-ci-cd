package com.example.helloapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class HelloApplication {

	public static void main(final String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
