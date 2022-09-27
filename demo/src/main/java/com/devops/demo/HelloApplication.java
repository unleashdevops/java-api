package com.devops.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class HelloApplication {
    
    @GetMapping("/hello/{name}")    
    public String sayHello(@PathVariable("name") String name){
           System.out.println("Reached here");
           return "Hello."+name;
    }
}
