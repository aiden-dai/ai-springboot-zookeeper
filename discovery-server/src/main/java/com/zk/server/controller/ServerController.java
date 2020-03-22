package com.zk.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.zookeeper.serviceregistry.ServiceInstanceRegistration;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperRegistration;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperServiceRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController{


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

    

    
}