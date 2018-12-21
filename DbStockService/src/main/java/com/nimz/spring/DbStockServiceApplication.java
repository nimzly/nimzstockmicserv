package com.nimz.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages="com.nimz.spring.repository")
@SpringBootApplication
public class DbStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbStockServiceApplication.class, args);
	}

}

