package com.example.springproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RequestParamQuery {

    @GetMapping("/query")
    public String print(@RequestParam String name){
        return "Hello " + name + " welcome to BridgeLab!";
    }
}
