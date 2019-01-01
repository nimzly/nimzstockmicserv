package com.nimz.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class StockEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockEurekaServerApplication.class, args);
	}

}
