package com.restpersonalejercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.restpersonalejercicio.controller.PersonalController;

@SpringBootApplication
public class RestApiPersonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiPersonalApplication.class, args);
	}

}
