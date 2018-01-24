package org.gl.procamp.airline.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public abstract class Aircraft {

    private double fuelConsumption;
    private double totalCapacity;
    private double carryingCapacity;
    private double flightRange;
}
