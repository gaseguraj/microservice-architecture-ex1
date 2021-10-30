package com.gsegura.microarch.nationalitypredict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NationalityPredictApplication {

    public static void main(String[] args) {
        SpringApplication.run(NationalityPredictApplication.class, args);
    }

}
