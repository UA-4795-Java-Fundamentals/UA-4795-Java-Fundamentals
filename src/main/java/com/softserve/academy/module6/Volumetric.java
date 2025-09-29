package com.softserve.academy.module6;

public interface Volumetric {
    double PI = 3.14;

    double getVolume();

    static double getPI() {
        return Volumetric.PI;
    }

    default String printInfo() {
        return definition() + " from method printInfo";
    }

    private String definition() {
        return "Volumetric!";
    }

}
