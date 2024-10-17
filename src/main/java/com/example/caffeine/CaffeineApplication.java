package com.example.caffeine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = "com.example.caffeine.entity")
public class CaffeineApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaffeineApplication.class, args);
    }

}
