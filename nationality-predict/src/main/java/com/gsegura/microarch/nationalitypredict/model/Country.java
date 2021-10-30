package com.gsegura.microarch.nationalitypredict.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonProperty("country_id")
    private String countryId;
    private String probability;

    public Country(String countryId, String probability){
        this.countryId = countryId;
        this.probability = probability;
    }

}
