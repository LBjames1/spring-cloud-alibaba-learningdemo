package com.github.lauz.web;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
public class ProviderWeb {

    @RequestMapping(value = "provider/echo/{name}",method = RequestMethod.GET)
    public String echo(@PathVariable String name){
        return "hello!! "+name+", this is nacos provider";
    }
}
