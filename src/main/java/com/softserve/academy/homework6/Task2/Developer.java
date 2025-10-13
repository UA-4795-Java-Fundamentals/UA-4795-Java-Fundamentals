package com.softserve.academy.homework6.Task2;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d," +
                "Position: %s, Salary: $ %.2f.", super.name, super.age, position, super.salary);
    }
}
