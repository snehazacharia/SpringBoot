package com.starbucks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarbucksUiApplication {

	public static void main(String[] args) {
		System.out.println("new change");
		SpringApplication.run(StarbucksUiApplication.class, args);
	}
}
