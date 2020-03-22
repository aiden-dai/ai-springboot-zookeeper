package com.zk.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController{

    @Value("${name}")
    private String name;

    @RequestMapping("/")
    public String home() {
        return "Hello "+name;
    }

    
}