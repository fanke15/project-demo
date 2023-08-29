package com.gen.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.gen.app","com.gen.core"})
public class GenApp {
    public static void main(String[] args) {

        SpringApplication.run(GenApp.class, args);
    }

}
