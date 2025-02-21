package com.example.springproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateRestController {

    @GetMapping("restcontroller")
    public String print(){
        return "Demonstrate Rest Controller..";
    }
}
