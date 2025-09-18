package com.softserve.academy.homework4;

import java.util.Arrays;
import java.util.Comparator;

public class Dog {
    private String name;
    private DogBreed breed;
    private int age;

    public Dog(String name, DogBreed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public DogBreed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static void sortByAge(Dog[] dogs) {
        Arrays.sort(dogs, Comparator.comparingInt(Dog::getAge).reversed());
    }
}
