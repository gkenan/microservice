package com.huawei.portal.controller;

import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InvokeService {

    private static final String SERVICE_NAME = "CounterService";

    private static final RestTemplate restTemplate = RestTemplateBuilder.create();

    public String invokeCounter(String method, String operation){
        return restTemplate.getForObject("cse://" + SERVICE_NAME + operation, String.class);
    }
    
}