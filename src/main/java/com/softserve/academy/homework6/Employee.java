package com.softserve.academy.homework6;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String report() {
        return String.format("Name %s, Age %d, " + "Salary: \u20B4 %.2f.", name, age, salary);
    }
}
class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return String.format("Name %s, Age %d, position: %s" + "Salary: \u20B4 %.2f.", getName(), getAge(),getPosition(), getSalary());
    }
}
class MainDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Olha", 29, 30000);
        Developer developer = new Developer("Petro", 38, 25000,"Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
