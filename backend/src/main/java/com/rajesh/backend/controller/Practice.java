package com.rajesh.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Practice {
    @GetMapping("/")
    public String home() {
        return "Spring Boot Running";
    }
}
