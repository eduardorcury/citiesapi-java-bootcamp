package com.digitalinnovationone.citiesapi.cities.resources;

import com.digitalinnovationone.citiesapi.cities.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public Page listCities(Pageable page) {
        return cityRepository.findAll(page);
    }

}
