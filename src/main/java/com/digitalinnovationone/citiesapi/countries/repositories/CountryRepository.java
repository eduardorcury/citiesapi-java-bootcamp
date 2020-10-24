package com.digitalinnovationone.citiesapi.countries.repositories;

import com.digitalinnovationone.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
