package com.example.springproject;
import com.example.springproject.dtoBeans.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class PostRequest {

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
