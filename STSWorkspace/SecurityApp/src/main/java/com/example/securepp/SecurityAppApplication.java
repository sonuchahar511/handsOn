package com.example.securepp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.securepp.controller.MyBanner;

@SpringBootApplication
public class SecurityAppApplication {

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(SecurityAppApplication.class);
		application.setBanner(new MyBanner());
		application.run(args);
		/* SpringApplication.run(SecurityAppApplication.class, args); */
	}

}
