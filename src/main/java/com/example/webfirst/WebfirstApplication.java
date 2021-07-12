package com.example.webfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.*")
@SpringBootApplication
public class WebfirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfirstApplication.class, args);
    }

}
