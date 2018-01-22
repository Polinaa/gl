package org.gl.procamp.airline.service.impl;

import org.gl.procamp.airline.service.InputOutputService;

public class TerminalIO implements InputOutputService {

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public int readInteger() {
        return 0;
    }

    @Override
    public double readDouble() {
        return 0;
    }
}
