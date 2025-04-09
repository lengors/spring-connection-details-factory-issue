package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.custom.CustomPGConnectionDetails;

@SpringBootApplication
public class DemoApplication {
	DemoApplication(final CustomPGConnectionDetails customPGConnectionDetails) {
		System.out.println("Custom PG Connection Details: " + customPGConnectionDetails.getHost());
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
