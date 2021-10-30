package com.gsegura.microarch.predictionwsconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumePredictionService {

    @Autowired
    private RestTemplate restTemplate;

    public String returnResult(String name){
        return restTemplate.getForObject("https://api.nationalize.io/?name=" + name, String.class);
    }
}
