package com.example.RestAPI.controller;

import com.example.RestAPI.DTOUser.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloControllerDTO {

    // Handle POST request with JSON body
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!!!";
        //curl.exe -X POST -H "Content-Type: application/json" -d '{\"firstName\": \"Arnav\", \"lastName\": \"Saxena\"}' "http://localhost:8080/hello/post" -w "\n"
    }
}