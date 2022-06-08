package com.bradon.jwtpractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/api/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("hello");
    }
}
