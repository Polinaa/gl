package org.gl.procamp.airline.util;

import lombok.Getter;
import org.gl.procamp.airline.model.Aircraft;

import java.util.Comparator;

@Getter
public enum AircraftSorting {

    BY_FLIGHT_RANGE_DESC ((e1, e2) -> Double.compare(
            e1.getFlightRange(), e2.getFlightRange()));

    private Comparator<Aircraft> comparator;

    private AircraftSorting(Comparator<Aircraft> comparator) {
        this.comparator = comparator;
    }
}
