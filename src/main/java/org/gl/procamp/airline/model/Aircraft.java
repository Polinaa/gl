package org.gl.procamp.airline.model;

import lombok.Getter;

@Getter
public abstract class Aircraft {

    private double fuelConsumption;
    private double totalCapacity;
    private double carryingCapacity;
    private double flightRange;
}
