package com.example.consul.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Consul";
    }

    @RequestMapping("/health")
    public String health() {
        return "Health OK";
    }
}
