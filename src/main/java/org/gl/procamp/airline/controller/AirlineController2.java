package org.gl.procamp.airline.controller;

import org.gl.procamp.airline.model.*;
import org.gl.procamp.airline.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AirlineController2 {

    @Autowired
    private AirlineService airlineService;

    @PostConstruct
    public void initDummyData() {
        List<Aircraft> aircrafts = new ArrayList<>();
        aircrafts.addAll(
            Arrays.asList(
                new Landplane(4, 7, 5, 4),
                new Landplane(5, 0, 3, 6),
                new Landplane(4, 8, 1, 9),
                new Airship(3, 2, 1, 3),
                new Gyroplane(3, 6, 8, 2),
                new Helicopter(1, 3, 4, 4))
                        );
        airline = new Airline(aircrafts);
    }

    @RequestMapping("/airlines")
    public List<Airline> findAllAirlines() {
        return airlineService.getAllAirlines();
    }
}
