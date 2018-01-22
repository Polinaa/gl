package org.gl.procamp.airline.service.impl;

import org.gl.procamp.airline.model.Aircraft;
import org.gl.procamp.airline.model.Airline;
import org.gl.procamp.airline.service.AirlineService;
import org.gl.procamp.airline.util.AircraftSorting;

import java.util.Arrays;
import java.util.List;

public class AirlineServiceImpl implements AirlineService {

    @Override
    public double countTotalCapacity(Airline airline) {
        return airline.getAircrafts().stream().map(a -> a.getTotalCapacity()).count();
    }

    @Override
    public double countCarryingCapacity(Airline airline) {
        return airline.getAircrafts().stream().map(a -> a.getCarryingCapacity()).count();
    }

    @Override
    public List<Aircraft> getAllAircrafts(Airline airline, AircraftSorting sortBy) {
        List <Aircraft> aircrafts = airline.getAircrafts();
        aircrafts.sort(sortBy.getComparator());
        return aircrafts;
    }

    @Override
    public List<Aircraft> getlAircraftsByFuelConsumption(Airline airline, double minFuelConsumption,
                                                         double maxFuelConsumption) {
        return airline.getAircrafts().stream().filter(a -> minFuelConsumption >= a.getFuelConsumtion && a.getFuelConsumtion() >= minFuelConsumption).collect(
            Arrays.asList());
    }
}
