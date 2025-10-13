package com.softserve.academy.homework6.Task2;

public class Task2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Slavko", 52, 5500);
        Developer developer = new Developer("Oleksandr", 20, 12000, "React/Java FullStack");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
