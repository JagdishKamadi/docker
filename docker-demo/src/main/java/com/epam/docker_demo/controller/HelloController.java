package com.epam.docker_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> getUserName() {
        return ResponseEntity.ok("Hello Jagdish");
    }
}