package com.gsegura.microarch.nationalitypredict.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String countryId;
    private String probability;

    public Country(String countryId, String probability){
        this.countryId = countryId;
        this.probability = probability;
    }

}
