package org.gl.procamp.airline.model;

public class Landplane extends Aircraft implements HeavierThanAirAircraft, PowerDrivenAircraft {
    public Landplane(double fuelConsumption, double totalCapacity, double carryingCapacity, double flightRange) {
        super(fuelConsumption, totalCapacity, carryingCapacity, flightRange);
    }
}
