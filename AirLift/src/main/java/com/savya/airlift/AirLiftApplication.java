package com.savya.airlift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.savya.airlift.controller", "com.savya.airlift.service"})
@EntityScan(basePackages = {"com.savya.airlift.entity"})
@EnableJpaRepositories(basePackages = {"com.savya.airlift.repository"})
public class AirLiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirLiftApplication.class, args);
    }
}
