package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class hellocontroller {

    @RequestMapping("/hi")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
