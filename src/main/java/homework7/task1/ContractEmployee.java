package homework7.task1;

public class ContractEmployee extends Employee implements Payment {
    double salaryPerMonth;
    String federalTaxIdMember;

    public ContractEmployee(String employeeId, double salaryPerMonth, String federalTaxIdMember) {
        super(employeeId);
        this.salaryPerMonth = salaryPerMonth;
        this.federalTaxIdMember = federalTaxIdMember;
    }


    @Override
    public double calculatePay() {
        return salaryPerMonth;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "ID='" + employeeId + '\'' +
                ", FederalTaxId='" + federalTaxIdMember + '\'' +
                ", MonthlyPay=" + calculatePay() +
                '}';
    }

}