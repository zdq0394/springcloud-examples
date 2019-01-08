package com.example.eureka.consumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello "+name+", this is message in callback.";
    }
}
