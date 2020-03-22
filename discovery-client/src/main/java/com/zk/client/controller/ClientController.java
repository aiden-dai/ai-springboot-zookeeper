package com.zk.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController{


    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }


    @LoadBalanced
	@Bean
	public RestTemplate loadbalancedRestTemplate() {
		return new RestTemplate();
	}

    @Autowired
    private RestTemplate restTemplate;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
        
		String uri = "http://zk-server/";
		
		String response = restTemplate.getForObject(uri, String.class);

		return response;
	}
    
}