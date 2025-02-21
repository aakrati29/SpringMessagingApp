package com.example.springproject;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class PutRequest {

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}

