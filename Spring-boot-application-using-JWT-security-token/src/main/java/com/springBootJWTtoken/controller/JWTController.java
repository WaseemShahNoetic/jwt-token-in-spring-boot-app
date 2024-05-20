package com.springBootJWTtoken.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWTController {


    @GetMapping("/world")
    public String helloWorld(){
        return "Well come to Noetic tech profile";

    }
}
