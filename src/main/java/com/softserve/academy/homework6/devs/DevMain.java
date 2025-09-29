package com.softserve.academy.homework6.devs;

public class DevMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Reggie", 23, 2300);
        Developer developer = new Developer("Borat", 27, 2500, "Jav Dev");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
