package com.softserve.academy.homework3;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    static double totalSum = 0;

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += this.getSalary();
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return this.getSalary() * 0.1;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Rate: " + rate + "\n" +
                "Hours: " + hours + "\n" +
                "Salary: " + this.getSalary() + "\n" +
                "Bonuses: " + this.getBonuses() + "\n" +
                "Total Salary: " + totalSum +  "\n";
    }
}
