package com.gsegura.microarch.nationalitypredict.controller;

import com.gsegura.microarch.nationalitypredict.model.Prediction;
import com.gsegura.microarch.nationalitypredict.service.PredictionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("nationality-predict/")
public class PredictionController {

    Logger logger = LoggerFactory.getLogger(PredictionController.class);

    @Autowired
    PredictionService predictionService;

    @GetMapping("{name}")
    public Prediction getPrediction(@PathVariable String name) {
        return predictionService.getPrediction(name);
    }
}

