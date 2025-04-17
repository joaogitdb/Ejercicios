package com.empresa.eclipselinkcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(
	    exclude = HibernateJpaAutoConfiguration.class
	)
public class EclipselinkCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EclipselinkCrudApplication.class, args);
	}

}
