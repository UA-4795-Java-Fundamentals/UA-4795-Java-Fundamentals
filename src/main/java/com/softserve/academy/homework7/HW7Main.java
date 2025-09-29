package com.softserve.academy.homework7;

public class HW7Main {
    public static void main(String[] args) {
        int employeesCount = 10;
        Employee[] employees = new Employee[employeesCount];
        employees[0] = new SalariedEmployee("1", "Dennis", 50, 48);
        employees[1] = new SalariedEmployee("2", "Anka", 48, 48);
        employees[2] = new SalariedEmployee("3", "Julia", 52, 50);
        employees[3] = new SalariedEmployee("4", "Juliet", 46, 52);
        employees[4] = new SalariedEmployee("5", "Yuriy", 54, 46);
        employees[5] = new ContractEmployee("6", "Aram", 2460);
        employees[6] = new ContractEmployee("7", "Tom", 2790);
        employees[7] = new ContractEmployee("8", "Adrian", 2500);
        employees[8] = new ContractEmployee("9", "John", 2640);
        employees[9] = new ContractEmployee("10", "Liz", 2600);

        boolean swapped;
        for (int i = 0; i < employeesCount - 1; i++) {
            swapped = false;
            for (int j = 0; j < employeesCount - i - 1; j++) {
                Payment p1 = (Payment) employees[j];
                Payment p2 = (Payment) employees[j + 1];

                if (p1.calculatePay() < p2.calculatePay()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Sorted array:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
