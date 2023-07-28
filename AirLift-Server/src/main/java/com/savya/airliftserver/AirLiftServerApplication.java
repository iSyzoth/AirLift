package com.savya.airliftserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AirLiftServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirLiftServerApplication.class, args);
	}

}
