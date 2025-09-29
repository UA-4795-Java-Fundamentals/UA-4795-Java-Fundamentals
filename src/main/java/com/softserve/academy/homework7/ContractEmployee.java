package com.softserve.academy.homework7;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember;
    private int monthlySalary;

    public ContractEmployee(String employeeId, String federalTaxIdmember, int monthlySalary) {
        super(employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "Id" + super.getEmployeeId() +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", monthlySalary=" + calculatePay() +
                '}';
    }
}
