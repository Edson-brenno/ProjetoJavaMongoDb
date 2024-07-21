package com.spring.workshopcommongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EntityScan(basePackages = "com.spring.Entities")
@EnableMongoRepositories(basePackages = "com.spring.Repository")
@ComponentScan(basePackages = "com.spring")
public class WorkShopComMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkShopComMongoApplication.class, args);
    }

}
