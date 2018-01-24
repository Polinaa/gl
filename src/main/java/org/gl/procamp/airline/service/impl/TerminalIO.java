package org.gl.procamp.airline.service.impl;

import org.gl.procamp.airline.service.InputOutputService;

import java.util.Scanner;

public class TerminalIO implements InputOutputService {

    @Override
    public void println(Object object) {
        println(object.toString());
    }

    @Override
    public void println(String message) {
        System.out.println(message);
    }

    @Override
    public int readInteger() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    @Override
    public double readDouble() {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
}
