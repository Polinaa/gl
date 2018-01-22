package org.gl.procamp.airline.controller;

import org.gl.procamp.airline.service.InputOutputService;
import org.gl.procamp.airline.service.impl.TerminalIO;
import org.gl.procamp.airline.util.MenuOptions;

public class AirlineController {
    private InputOutputService terminalIO = new TerminalIO();

    public void loadData() {

    }

    public void run() {
        int command;
        do {
            terminalIO.print(MenuOptions.getMenuMessage());
            command = terminalIO.readInteger();

        } while (command != MenuOptions.EXIT.getOptionNumber);
    }

    private void execute(int commandNumber) {

    }
}
