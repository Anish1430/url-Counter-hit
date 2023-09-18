package com.Anish.urlCounterhit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "Controller")
public class UrlCounterHitApplication {
	public static void main(String[] args) {
		SpringApplication.run(UrlCounterHitApplication.class, args);
		 System.out.println("Anish is creating a Url Hit Counter Project");
	}
}
