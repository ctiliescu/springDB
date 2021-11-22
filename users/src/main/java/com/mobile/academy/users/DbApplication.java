package com.mobile.academy.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
		"com.mobile.academy.core",
		"com.mobile.academy.users"
})

@SpringBootApplication
public class DbApplication {
	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}

}
