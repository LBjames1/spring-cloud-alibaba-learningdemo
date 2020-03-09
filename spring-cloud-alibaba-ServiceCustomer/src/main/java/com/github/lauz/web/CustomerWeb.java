package com.github.lauz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@RestController
public class CustomerWeb {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "customer/echo/{name}",method = RequestMethod.GET)
    public String echo(@PathVariable String name){
        return restTemplate.getForObject("http://ServiceProvider/provider/echo/" + name, String.class);
    }
}
