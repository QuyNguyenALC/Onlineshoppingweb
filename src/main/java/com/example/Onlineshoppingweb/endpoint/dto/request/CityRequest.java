package com.example.Onlineshoppingweb.endpoint.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CityRequest implements Serializable {

    @JsonProperty("name")
    private String name;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("district")
    private String district;

    @JsonProperty("population")
    private Integer population;
}
