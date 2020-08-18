package com.example.hellospring;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(final String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	@Autowired
	private Environment env;
	
	public void run(String... args) {
//		System.out.println(getBanner(env.getProperty("asciiColorMode")));
	}


}
