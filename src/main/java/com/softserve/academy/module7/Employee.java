package com.softserve.academy.module7;

import java.util.Arrays;
import java.util.Comparator;

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
        Arrays.sort(employees, new NameComparator());
        System.out.println("Sorted by Name");

        for (Employee emp : employees) {
            System.out.println(emp);

        }
        Arrays.sort(employees, new TabNumberComparator());
        System.out.println("Sorted by TabNumber");

        for (Employee emp : employees) {
            System.out.println(emp);

        }

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int nameCompare = o1.name.compareTo(o2.name);
                if (nameCompare != 0) {
                    return nameCompare;
                }
                return Integer.compare(o1.tabNumber, o2.tabNumber);
            }
        });

        for (Employee emp : employees) {
            System.out.println(emp);
        }

    }
}