package org.gl.procamp.airline.service;

import org.gl.procamp.airline.model.Aircraft;
import org.gl.procamp.airline.model.Airline;
import org.gl.procamp.airline.util.AircraftSorting;

import java.util.List;

public interface AirlineService {

    public double countTotalCapacity(Airline airline);
    public double countCarryingCapacity(Airline airline);
    public List<Aircraft> getAllAircrafts(Airline airline, AircraftSorting sortBy);

}
