package com.junyue.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return name+" said: Hello Jenkins";
    }
    @GetMapping("/testJenkins")
    public String testJenkins(){
        return "You have successfully accessed Jenkins";
    }
}
