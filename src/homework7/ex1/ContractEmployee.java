package ex1;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class ContractEmployee extends Employee implements Payment {

    private String federalTaxIdmember = "";
    private int fixedMonthlyPayment = 0;
    private double averegeMonthlySalary = 0;
    static Random random = new Random();
        public ContractEmployee(String employeeld, String federalTaxIdMember) {
        this.employeeld = employeeld;
        this.federalTaxIdmember = federalTaxIdMember;
        this.averegeMonthlySalary = averegeMonthlySalary;
    }

    public void inPutFixedMonthlyPayment(){
        fixedMonthlyPayment = random.nextInt(1000);
    }



    @Override
    public double calculatePay() {
            this.averegeMonthlySalary = fixedMonthlyPayment;
        return averegeMonthlySalary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", employeeld='" + employeeld + '\'' +
                " + averegeMonthlySalary = " + averegeMonthlySalary + '}';
    }
}

