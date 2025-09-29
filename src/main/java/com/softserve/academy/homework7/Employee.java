package com.softserve.academy.homework7;

public abstract class Employee {
    private String employeeId;

    protected Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
