package com.digitalinnovationone.citiesapi.states.repositories;

import com.digitalinnovationone.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
