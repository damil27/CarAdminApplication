package com.project2.carapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class CarappApplication {

	@Bean

	public AuditorAware<String>  auditorAware(){
		return new SecurityAuditorAware();
	}

	public static void main(String[] args) {
		SpringApplication.run(CarappApplication.class, args);
	}

}
