package com.example.Onlineshoppingweb.repository;

import com.example.Onlineshoppingweb.model.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer> {

    List<CityEntity> findByCountryCode(String code);

//    Optional<CityEntity> findById
}
