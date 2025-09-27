package homework7.task1;


public class SalariedEmployee extends Employee implements Payment {
    double salaryPerHour;
    String socialSecurityNumber;

    public SalariedEmployee(String employeeId, double salaryPerHour, String socialSecurityNumber) {
        super(employeeId);
        this.salaryPerHour = salaryPerHour;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return salaryPerHour * 160; //160 - average working hour per month
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "ID='" + employeeId + '\'' +
                ", SocialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", MonthlyPay=" + calculatePay() +
                '}';
    }

}
