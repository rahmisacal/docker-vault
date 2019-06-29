package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class VaultDemo {

    public static void main(String[] args) {

        SpringApplication.run(VaultDemo.class, args);
    }

    @Value("${root}")
    private String who1;

    @Value("${test}")
    private String who2;

    @Value("${devops}")
    private String who3;

    @RequestMapping("")
    public String hello() {
        return String.format("Hello %s, %s, %s", who1, who2, who3);
    }
}