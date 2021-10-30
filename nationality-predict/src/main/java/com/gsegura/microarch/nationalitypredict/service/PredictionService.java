package com.gsegura.microarch.nationalitypredict.service;

import com.gsegura.microarch.nationalitypredict.controller.PredictionController;
import com.gsegura.microarch.nationalitypredict.model.Country;
import com.gsegura.microarch.nationalitypredict.model.Prediction;
import com.gsegura.microarch.nationalitypredict.repository.PredictionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredictionService {
    Logger logger = LoggerFactory.getLogger(PredictionService.class);

    @Autowired
    private PredictionRepository predictionRepository;

    public Prediction getPrediction(){
        //consume microservice

        List<Country> countries = List.of(
                new Country("COL", "0.50"),
                new Country("AR", "0.80"));
        Prediction prediction = new Prediction("Andres",countries);

        System.out.println("Prediction: " + String.valueOf(prediction));
        this.storePrediction(prediction);
        return null;
    }

    public void  storePrediction(Prediction prediction){
        predictionRepository.save(prediction);
    }
}
