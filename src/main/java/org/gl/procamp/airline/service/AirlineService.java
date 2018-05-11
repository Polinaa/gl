package org.gl.procamp.airline.service;

import org.gl.procamp.airline.model.Aircraft;
import org.gl.procamp.airline.model.Airline;
import org.gl.procamp.airline.util.AircraftSorting;

import java.util.List;

public interface AirlineService {

    double countTotalCapacity(Airline airline);
    double countCarryingCapacity(Airline airline);
    List<Aircraft> getAllAircrafts(Airline airline, AircraftSorting sortBy);
    List<Aircraft> getlAircraftsByFuelConsumption(Airline airline, double minFuelConsumption, double maxFuelConsumption);
    List<Airline> getAllAirlines();
}
