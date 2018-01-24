package org.gl.procamp.airline.controller;

import org.gl.procamp.airline.model.*;
import org.gl.procamp.airline.service.AirlineService;
import org.gl.procamp.airline.service.InputOutputService;
import org.gl.procamp.airline.service.impl.AirlineServiceImpl;
import org.gl.procamp.airline.service.impl.TerminalIO;
import org.gl.procamp.airline.util.AircraftSorting;
import org.gl.procamp.airline.util.MenuOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirlineController {
    private InputOutputService terminalIO = new TerminalIO();
    private AirlineService airlineService = new AirlineServiceImpl();
    private Airline airline;

    public void loadData() {
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

    public void run() {
        MenuOption command;
        try {
            do {
                terminalIO.println(MenuOption.getMenuMessage());
                command = MenuOption.getOption(terminalIO.readInteger());
                execute(command);
            } while (command != MenuOption.EXIT);
        } catch (Exception e) {
            terminalIO.println(e);
            run();
        }
    }

    private void execute(MenuOption commandNumber) {
        switch (commandNumber) {
            case CALCULATE_TOTAL_CAPACITY:
                double totalCapacity = airlineService.countTotalCapacity(airline);
                terminalIO.println(totalCapacity);
                break;
            case CALCULATE_CARRYING_CAPACITY:
                double carryingCapacity = airlineService.countCarryingCapacity(airline);
                terminalIO.println(carryingCapacity);
                break;
            case DISPLAY_AIRCRAFTS_BY_FLIGHT_RANGE:
                List<Aircraft> sortedAircrafts = airlineService.getAllAircrafts(airline, AircraftSorting.BY_FLIGHT_RANGE_DESC);
                terminalIO.println(sortedAircrafts);
                break;
            case FIND_AIRPLANE_BY_FUEL_CONSUMPTION:
                terminalIO.println(MenuOption.ENTER_MIN_DOUBLE_MESSAGE);
                double min = terminalIO.readDouble();
                terminalIO.println(MenuOption.ENTER_MAX_DOUBLE_MESSAGE);
                double max = terminalIO.readDouble();
                List<Aircraft> aircrafts = airlineService.getlAircraftsByFuelConsumption(airline, min, max);
                terminalIO.println(aircrafts);
                break;
        }
    }
}
