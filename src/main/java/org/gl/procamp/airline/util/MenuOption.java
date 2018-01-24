package org.gl.procamp.airline.util;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum MenuOption {
    CALCULATE_TOTAL_CAPACITY(1, "Calculate total capacity"),
    CALCULATE_CARRYING_CAPACITY(2, "Calculate carrying capacity"),
    DISPLAY_AIRCRAFTS_BY_FLIGHT_RANGE(3, "Display aircrafts by flight range"),
    FIND_AIRPLANE_BY_FUEL_CONSUMPTION(4, "Find airplane by fuel consumption"),
    EXIT(5, "EXIT");

    private static final String WELCOME_MESSAGE = "\nEnter one of the options:\n";
    private static final String SEPARATOR = "--------------------------------\n";
    private static final String MENU_OPTION_FORMAT = "%d. %s\n";
    public static final String ENTER_MIN_DOUBLE_MESSAGE = "Enter min range:";
    public static final String ENTER_MAX_DOUBLE_MESSAGE = "Enter max range:";

    private int optionNumber;
    private String message;

    MenuOption(int optionNumber, String message) {
        this.optionNumber = optionNumber;
        this.message = message;
    }

    public static MenuOption getOption(int optionNumber) {
        return Arrays.stream(MenuOption.values())
                .filter(option -> option.getOptionNumber() == optionNumber)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unsupported option number: " + optionNumber));
    }

    public static StringBuilder getMenuMessage() {
        StringBuilder menuMessage = new StringBuilder();
        menuMessage.append(WELCOME_MESSAGE).append(SEPARATOR);
        Arrays.stream(MenuOption.values()).forEach(option -> menuMessage.append(String.format(MENU_OPTION_FORMAT, option.getOptionNumber(), option.getMessage())));
        menuMessage.append(SEPARATOR);
        return menuMessage;
    }
}
