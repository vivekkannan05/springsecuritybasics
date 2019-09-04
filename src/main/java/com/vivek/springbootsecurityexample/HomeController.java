package com.vivek.springbootsecurityexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/sayHello")
    public String sayHello(String input){
        return "Hello "+input;

    }

    @GetMapping("/")
    public String welcome(){
        return "<h1>Welcome</h1>";

    }
}
