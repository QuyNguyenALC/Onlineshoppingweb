package com.example.Onlineshoppingweb.service;

import com.example.Onlineshoppingweb.endpoint.dto.request.CityRequest;
import com.example.Onlineshoppingweb.model.CityEntity;

public interface ShoppingService {

    String function1(int a);

    CityEntity findCityById(Integer id);

    CityEntity createCity(CityRequest cityRequest);
}
