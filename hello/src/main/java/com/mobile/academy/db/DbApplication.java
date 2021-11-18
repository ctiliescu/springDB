package com.mobile.academy.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.mobile.academy.db",
		"com.mobile.academy.users"
})
public class DbApplication {
	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}

}
