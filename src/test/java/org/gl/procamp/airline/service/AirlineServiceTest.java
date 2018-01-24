package org.gl.procamp.airline.service;

import junit.framework.Assert;
import org.gl.procamp.airline.model.*;
import org.gl.procamp.airline.service.impl.AirlineServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirlineServiceTest {

    private AirlineService airlineService = new AirlineServiceImpl();
    private Airline airline;

    @Before
    public void loadTestData() {
        List<Aircraft> aircrafts = new ArrayList<>();
        aircrafts.addAll(
                Arrays.asList(
                        new Landplane(4, 7, 5, 4),
                        new Landplane(5, 0, 3, 6),
                        new Landplane(4, 8, 1, 9),
                        new Airship(3, 2, 1, 3),
                        new Gyroplane(3, 6, 8, 2),
                        new Helicopter(1, 3, 4, 4))
        );
        airline = new Airline(aircrafts);
    }

    @Test
    public void countTotalCapacity() {
        Assert.assertEquals(26.0, airlineService.countTotalCapacity(airline));
    }

    @Test(expected = NullPointerException.class)
    public void countTotalCapacityNullArg() {
        airlineService.countTotalCapacity(null);
    }
}
