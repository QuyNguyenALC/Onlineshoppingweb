package com.example.Onlineshoppingweb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="city")
@Getter
@Setter
public class CityEntity implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "CountryCode")
    @JsonProperty("CountryCode")
    private String countryCode;

    @Column(name = "District")
    @JsonProperty("District")
    private String district;

    @Column(name = "Population")
    @JsonProperty("Population")
    private Integer population;


}
