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
    private String root;

    @Value("${test}")
    private String test;

    @Value("${devops}")
    private String devops;

    @RequestMapping("")
    public String hello() {
        return String.format("root.value = %s | test.value = %s | devops.value = %s ", root, test, devops);
    }
}
