package com.gsegura.microarch.nationalitypredict.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "prediction")
@NoArgsConstructor
@Data
@ToString
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "prediction_id", referencedColumnName = "id")
    private List<Country> countries;

    public Prediction(String name, List<Country> countries){
        this.name = name;
        this.countries = countries;
    }



}
