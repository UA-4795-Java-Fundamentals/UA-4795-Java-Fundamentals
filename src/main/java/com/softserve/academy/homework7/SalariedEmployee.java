package com.softserve.academy.homework7;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private int hourlyRate;
    private int hoursWorked;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, int hourlyRate, int hoursWorked) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "Id" + super.getEmployeeId() +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", monthly wage=" + calculatePay() + '}';
    }
}
