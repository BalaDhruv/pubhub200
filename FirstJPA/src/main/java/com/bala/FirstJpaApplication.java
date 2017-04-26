package com.bala;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstJpaApplication {
	
	public static final Logger LOGGER = Logger.getLogger(FirstJpaApplication.class); 

	public static void main(String[] args) {
		SpringApplication.run(FirstJpaApplication.class, args);
		LOGGER.info("Appplication Started");
	}
}
