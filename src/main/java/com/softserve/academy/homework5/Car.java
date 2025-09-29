package com.softserve.academy.homework5;

import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", yearOfProduction=" + yearOfProduction +
                ", type='" + type + '\'' +
                '}';
    }
}

class CarDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = {
                new Car("Volvo V-", 2025, 3.0),
                new Car("Honda Acord", 2020, 2.2),
                new Car("Ford Fusion", 2018, 1.5),
                new Car("BMW X5", 2020, 3.0)
        };
        System.out.println("Enter a year to search :");
        int year = scanner.nextInt();
        for (Car c : cars) {
            if (c.getYearOfProduction() == year)
                System.out.println(c);
        }
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYearOfProduction() > cars[j + 1].getYearOfProduction()) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
        System.out.println("Car sorted by year of production: ");
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}

