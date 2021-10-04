package com.example.hibernate_example.service;

import com.example.hibernate_example.model.City;

import java.util.List;

public interface CityService {
    City save(City City);
    List<City> getAll();
    City get(long id);
    City updateCity(City City, long id);
    void delete(long id);
}
