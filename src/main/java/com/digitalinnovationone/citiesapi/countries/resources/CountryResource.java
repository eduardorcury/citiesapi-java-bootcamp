package com.digitalinnovationone.citiesapi.countries.resources;

import com.digitalinnovationone.citiesapi.countries.entities.Country;
import com.digitalinnovationone.citiesapi.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public List<Country> listCountries() {
        return countryRepository.findAll();
    }

}
