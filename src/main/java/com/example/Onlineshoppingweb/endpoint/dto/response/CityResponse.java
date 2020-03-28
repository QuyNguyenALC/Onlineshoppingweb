package com.example.Onlineshoppingweb.endpoint.dto.response;

import com.example.Onlineshoppingweb.model.CityEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class CityResponse implements Serializable {

    public CityResponse(CityEntity cityEntity) {
        BeanUtils.copyProperties(cityEntity, this);
    }

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("district")
    private String district;

    @JsonProperty("population")
    private Integer population;

}
