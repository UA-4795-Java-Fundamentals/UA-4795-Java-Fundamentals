package com.softserve.academy.module7;

import java.util.Arrays;

public class Employee {
    int tabNumber;
    String name;

    public Employee(int tabNumber, String name) {
        this.tabNumber = tabNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [tabNumber=" + tabNumber + ", name=" + name + "]";
    }


}

class EmpDemo {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(1, "Bob"),
                new Employee(15, "Alice"),
                new Employee(8, "Bob")
        };

        for (Employee emp : employees) {
            System.out.println(emp);

        }
        Arrays.sort(employees,new NameComparator());
        System.out.println("Sorted by Name");

        for (Employee emp : employees) {
            System.out.println(emp);

        }
        Arrays.sort(employees,new TabNumberComparator());
        System.out.println("Sorted by TabNumber");

        for (Employee emp : employees) {
            System.out.println(emp);

        }

    }
}