package org.gl.procamp.airline.model;

public class Balloon extends Aircraft implements LighterThanAirAircraft {
    public Balloon(double fuelConsumption, double totalCapacity, double carryingCapacity, double flightRange) {
        super(fuelConsumption, totalCapacity, carryingCapacity, flightRange);
    }
}
