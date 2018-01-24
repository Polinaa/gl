package org.gl.procamp.airline.model;

public class Airship extends Aircraft implements LighterThanAirAircraft, PowerDrivenAircraft {

    public Airship(double fuelConsumption, double totalCapacity, double carryingCapacity, double flightRange) {
        super(fuelConsumption, totalCapacity, carryingCapacity, flightRange);
    }
}
