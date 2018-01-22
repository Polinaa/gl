package org.gl.procamp.airline;

import org.gl.procamp.airline.controller.AirlineController;

public class App {

    public static void main(String[] args) {
        AirlineController airlineController = new AirlineController();
        airlineController.loadData();
        airlineController.run();
    }
}
