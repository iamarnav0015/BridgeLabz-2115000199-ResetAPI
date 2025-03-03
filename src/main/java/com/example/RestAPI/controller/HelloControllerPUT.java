package com.example.RestAPI.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloControllerPUT {

    // Handle PUT request with path variable and query parameter
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!!!!";
        //curl.exe -X PUT "http://localhost:8080/hello/put/Arnav?lastName=Saxena" -w "\n"
    }
}
