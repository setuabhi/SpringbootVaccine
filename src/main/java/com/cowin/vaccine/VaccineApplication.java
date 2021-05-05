package com.cowin.vaccine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
public class VaccineApplication {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(VaccineApplication.class, args);
	}

}
