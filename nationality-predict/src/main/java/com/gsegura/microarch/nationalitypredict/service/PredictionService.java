package com.gsegura.microarch.nationalitypredict.service;

import com.gsegura.microarch.nationalitypredict.controller.PredictionController;
import com.gsegura.microarch.nationalitypredict.model.Country;
import com.gsegura.microarch.nationalitypredict.model.Prediction;
import com.gsegura.microarch.nationalitypredict.repository.PredictionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PredictionService {
    Logger logger = LoggerFactory.getLogger(PredictionService.class);

    @Autowired
    private PredictionRepository predictionRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Prediction getPrediction(String name){
        //consume microservice
        Prediction predictionReturned = restTemplate.getForObject("http://PREDICTION-EXTERNAL-WS/consume-external-api/" + name, Prediction.class);
        predictionRepository.save(predictionReturned);
        return predictionReturned;
    }
}
