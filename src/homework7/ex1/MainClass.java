package ex1;

import java.util.Arrays;
import java.util.Comparator;

public class MainClass {

    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("765867", "329382");
        SalariedEmployee employee2 = new SalariedEmployee("32455667", "329382");
        SalariedEmployee employee3 = new SalariedEmployee("987867", "329382");
        ContractEmployee employee4 = new ContractEmployee("94389", "4894383");
        ContractEmployee employee5 = new ContractEmployee("923938292", "0912332");
        ContractEmployee employee6 = new ContractEmployee("123", "23435345");

        Payment[] employees = {employee1, employee2, employee3, employee4, employee5, employee6};

        // ввод данных
        employee1.inPutAveregeMonthlySalary();
        employee2.inPutAveregeMonthlySalary();
        employee3.inPutAveregeMonthlySalary();
        employee4.inPutFixedMonthlyPayment();
        employee5.inPutFixedMonthlyPayment();
        employee6.inPutFixedMonthlyPayment();

        for (Payment p : employees) {
            p.calculatePay();
        }
        sortEmployeesBySalary(employees);
        for (Payment p : employees) {
            System.out.println(p);
        }
    }

    public static void sortEmployeesBySalary(Payment[] employees) {
        Arrays.sort(employees, Comparator.comparingDouble(Payment::calculatePay));
    }
}
