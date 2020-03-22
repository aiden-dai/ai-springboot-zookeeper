package com.zk.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.zookeeper.serviceregistry.ServiceInstanceRegistration;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperRegistration;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperServiceRegistry;
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


    // @Autowired
    // private ZookeeperServiceRegistry serviceRegistry;

    // public void registerThings() {
    //     ZookeeperRegistration registration = ServiceInstanceRegistration.builder()
    //             .defaultUriSpec()
    //             .address("anyUrl")
    //             .port(10)
    //             .name("/a/b/c/d/anotherservice")
    //             .build();
    //     this.serviceRegistry.register(registration);
    // }


    @LoadBalanced
	@Bean
	public RestTemplate loadbalancedRestTemplate() {
		return new RestTemplate();
	}

    @Autowired
    private RestTemplate restTemplate;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		// model.addAttribute("task", new Task());

		String uri = "http://zk-server/";
		
		String response = restTemplate.getForObject(uri, String.class);

		return response;
	}
    
}