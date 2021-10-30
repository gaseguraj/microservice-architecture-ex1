package com.gsegura.microarch.nationalitypredict.repository;

import com.gsegura.microarch.nationalitypredict.model.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictionRepository extends JpaRepository<Prediction, Integer> {
}
