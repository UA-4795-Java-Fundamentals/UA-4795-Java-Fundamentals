package com.softserve.academy.homework4;

enum Breed {
    AMSTAFF("American Staffordshire Terrier"),
    GERMAN_SHEPHERD("German Shepherd"),
    DOBERMAN("Doberman"),
    ROTTWEILER("Rottweiler"),
    PITBULL("Pitbull"),
    HATIKO("Hatiko"),
    SAINT_BERNARD("Saint Bernard");

    private final String name;

    Breed(String name) {
        this.name = name;
    }

    public String getBreedName() {
        return name;
    }
}

class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed.getBreedName();
    }

    public int getAge() {
        return age;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Chop", Breed.ROTTWEILER, 5);
        dogs[1] = new Dog("Spike", Breed.AMSTAFF, 14);
        dogs[2] = new Dog("Hatiko", Breed.HATIKO, 11);

        Dog oldest = dogs[0];
        for (Dog d : dogs) {
            if (d.getAge() > oldest.getAge()) {
                oldest = d;
            }
        }

        System.out.println("The oldest dog is " + oldest.getBreed() + " " + oldest.getName());
    }
}
