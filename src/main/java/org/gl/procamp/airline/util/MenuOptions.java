package org.gl.procamp.airline.util;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum MenuOptions {
    CALCULATE_TOTAL_CAPACITY(1, "Calculate total capacity"),
    CALCULATE_CARRYING_CAPACITY(2, "Calculate carrying capacity"),
    DISPLAY_AIRCRAFTS_BY_FLIGHT_RANGE(3, "Display aircrafts by flight range"),
    FIND_AIRPLAN_BY_FUEL_CONSUMPTION(4, "Find airplane by fuel consumption"),
    EXIT(5, "EXIT");

    private int optionNumber;

    private String message;

    private static final String SEPARATOR = "-------------------------";
    private static final String MENU_OPTION_FORMAT = "%d. %s\n";

    MenuOptions(int optionNumber, String message) {
        this.optionNumber = optionNumber;
        this.message = message;
    }

    public StringBuilder getMenuMessage() {
        StringBuilder menuMessage = new StringBuilder();
        menuMessage.append(SEPARATOR);
        Arrays.stream(MenuOptions.values()).forEach(option -> menuMessage.append(String.format(MENU_OPTION_FORMAT, option.getOptionNumber(), option.getMessage()));
        menuMessage.append(SEPARATOR);
        return menuMessage;
    }
}
