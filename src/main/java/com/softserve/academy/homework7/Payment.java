package com.softserve.academy.homework7;

public interface Payment {
    double calculatePay();
}

abstract class Employee {
    String employeeId;
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
}

class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private double fixedPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedPayment = fixedPayment;
    }

    @Override
    public double calculatePay() {
        return fixedPayment;
    }
}

class ContractEmployee extends Employee implements Payment {

    private String federalTaxIdmember;
    private double hourlyRate;
    private double numberOfHoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double hourlyRate, double numberOfHoursWorked) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("01", "Olga", "15", 40000);
        employees[1] = new ContractEmployee("02", "Bob", "25", 130, 150);
        employees[2] = new SalariedEmployee("03", "Jack", "20", 35000);
        employees[3] = new ContractEmployee("04", "Jones", "14", 132, 160);
        employees[4] = new SalariedEmployee("05", "Ivan", "18", 45000);

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                double pay1 = ((Payment) employees[j]).calculatePay();
                double pay2 = ((Payment) employees[j + 1]).calculatePay();
                if (pay1 < pay2) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
        for (Employee e : employees) {
            System.out.printf("%s | %s | %.2f%n", e.employeeId, e.name, ((Payment) e).calculatePay());
        }
    }
}