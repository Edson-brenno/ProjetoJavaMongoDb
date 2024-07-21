package com.spring.workshopcommongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.spring.Entities")
@ComponentScan(basePackages = "com.spring")
public class WorkShopComMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkShopComMongoApplication.class, args);
    }

}
