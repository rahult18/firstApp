package com.spring.firstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @GetMapping("/welcome")
    public String welcome(){
        return "Hello";
    }
}
