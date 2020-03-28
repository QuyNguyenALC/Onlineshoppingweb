package com.example.Onlineshoppingweb.service;

import com.example.Onlineshoppingweb.endpoint.dto.request.CityRequest;
import com.example.Onlineshoppingweb.model.CityEntity;
import com.example.Onlineshoppingweb.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ShopingServiceImpl implements ShoppingService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public String function1(int a) {
        return "function: " + String.valueOf(a);
    }

    @Override
    public CityEntity findCityById(Integer id) throws EntityNotFoundException{
        Optional<CityEntity> optionalCityEntity = cityRepository.findById(id);
        return optionalCityEntity.orElseThrow(() -> new EntityNotFoundException("not found"));
    }

    @Override
    public CityEntity createCity(CityRequest cityRequest) {
        CityEntity cityEntity = new CityEntity();
        cityEntity.setCountryCode(cityRequest.getCountryCode());
        cityEntity.setDistrict(cityRequest.getDistrict());
        cityEntity.setPopulation(cityRequest.getPopulation());

        return cityRepository.save(cityEntity);
    }
}
