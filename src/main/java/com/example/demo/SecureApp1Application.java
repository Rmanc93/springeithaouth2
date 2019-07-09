package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class SecureApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SecureApp1Application.class, args);
	}

}
