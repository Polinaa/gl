package org.gl.procamp.airline.service.impl;

import org.gl.procamp.airline.model.Aircraft;
import org.gl.procamp.airline.model.Airline;
import org.gl.procamp.airline.repository.AirlineRepository;
import org.gl.procamp.airline.service.AirlineService;
import org.gl.procamp.airline.util.AircraftSorting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AirlineServiceImpl implements AirlineService {

    @Autowired
    private AirlineRepository airlineRepository;

    @Override
    public double countTotalCapacity(Airline airline) {
        return airline.getAircrafts().stream()
                .mapToDouble(a -> a.getTotalCapacity())
                .sum();
    }

    @Override
    public double countCarryingCapacity(Airline airline) {
        return airline.getAircrafts().stream()
                .mapToDouble(a -> a.getCarryingCapacity())
                .sum();
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
        return airline.getAircrafts().stream()
                .filter(a -> minFuelConsumption <= a.getFuelConsumption() && a.getFuelConsumption() <= maxFuelConsumption)
                .collect(Collectors.toList());
    }

    @Override
    public List<Airline> getAllAirlines() {
        return (List<Airline>) airlineRepository.findAll();
    }
}
