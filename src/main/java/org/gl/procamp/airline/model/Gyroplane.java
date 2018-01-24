package org.gl.procamp.airline.model;

public class Gyroplane extends Aircraft implements HeavierThanAirAircraft, PowerDrivenAircraft {
    public Gyroplane(double fuelConsumption, double totalCapacity, double carryingCapacity, double flightRange) {
        super(fuelConsumption, totalCapacity, carryingCapacity, flightRange);
    }
}
