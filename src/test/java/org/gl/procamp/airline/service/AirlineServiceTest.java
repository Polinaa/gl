package org.gl.procamp.airline.service;

import junit.framework.Assert;
import org.gl.procamp.airline.model.Aircraft;
import org.gl.procamp.airline.model.Airline;
import org.gl.procamp.airline.model.Airship;
import org.gl.procamp.airline.model.Landplane;
import org.gl.procamp.airline.service.impl.AirlineServiceImpl;
import org.gl.procamp.airline.service.impl.TerminalIO;
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
                        new Airship(3, 2, 1, 3))

        );
        airline = new Airline(aircrafts);
    }

    @Test
    public void countTotalCapacity() {
        Assert.assertEquals(10, airlineService.countTotalCapacity(airline));
    }

    @Test
    public void countTotalCapacityNullArg() {
        Assert.assertEquals(10, airlineService.countTotalCapacity(null));
    }
}
