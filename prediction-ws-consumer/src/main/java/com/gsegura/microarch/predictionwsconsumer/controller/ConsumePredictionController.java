package com.gsegura.microarch.predictionwsconsumer.controller;

import com.gsegura.microarch.predictionwsconsumer.service.ConsumePredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consume-external-api/")
public class ConsumePredictionController {

    @Autowired
    ConsumePredictionService service;

    @GetMapping("{name}")
    public String getPrediction(@PathVariable String name){
        return  service.returnResult(name);
    }
}
