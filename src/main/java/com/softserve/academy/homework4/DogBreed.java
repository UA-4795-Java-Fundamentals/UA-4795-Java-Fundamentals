package com.softserve.academy.homework4;

public enum DogBreed {
    LABRADOR_RETRIEVER("Labrador Retriever"),
    GERMAN_SHEPHERD("German Shepherd"),
    GOLDEN_RETRIEVER("Golden Retriever"),
    FRENCH_BULLDOG("French Bulldog"),
    BEAGLE("Beagle");

    private final String name;

    DogBreed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
