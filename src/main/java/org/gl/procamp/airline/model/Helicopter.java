package org.gl.procamp.airline.model;

public class Helicopter extends Aircraft implements HeavierThanAirAircraft, PowerDrivenAircraft {
    public Helicopter(double fuelConsumption, double totalCapacity, double carryingCapacity, double flightRange) {
        super(fuelConsumption, totalCapacity, carryingCapacity, flightRange);
    }
}
