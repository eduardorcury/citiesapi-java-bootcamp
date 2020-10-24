package com.digitalinnovationone.citiesapi.states.resources;

import com.digitalinnovationone.citiesapi.states.entities.State;
import com.digitalinnovationone.citiesapi.states.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    private List<State> listStates() {
        return stateRepository.findAll();
    }

}
