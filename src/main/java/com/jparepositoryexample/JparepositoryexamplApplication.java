package com.jparepositoryexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class JparepositoryexamplApplication {

	public static void main(String[] args) {
		SpringApplication.run(JparepositoryexamplApplication.class, args);
	}
}
