package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("New User connected");
        return "Hello, Spring Boot!";
    }
    @GetMapping("/")
    public String homePage(){
        System.out.println("Someone Home");
        return "Welcome this is a Spring boot app";
    }
}
