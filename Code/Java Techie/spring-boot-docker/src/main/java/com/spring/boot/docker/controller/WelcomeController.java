package com.spring.boot.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(path = "/welcome")
    public String welcome() {
        return "<h1>Welcome to docker in Spring Boot Microservices...</h1>";
    }

}
