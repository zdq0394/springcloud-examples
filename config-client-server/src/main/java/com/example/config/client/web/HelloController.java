package com.example.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
class HelloController{
    @Value("${orchid.hello}")
    private String hello;
    @RequestMapping("/hello")
    public String from(){
        return this.hello;
    }
}