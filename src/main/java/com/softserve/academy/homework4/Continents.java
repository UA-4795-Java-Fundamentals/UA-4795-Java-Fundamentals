package com.softserve.academy.homework4;

public enum Continents {
    EUROPE("Europe"),
    ASIA("Asia"),
    AFRICA("Africa"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America"),
    AUSTRALIA("Australia"),
    ANTARCTICA("Antarctica");

    private final String name;

    Continents(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
