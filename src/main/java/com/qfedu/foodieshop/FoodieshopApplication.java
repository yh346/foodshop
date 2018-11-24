package com.qfedu.foodieshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.qfedu.foodieshop.mapper")
public class FoodieshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodieshopApplication.class, args);
    }
}
