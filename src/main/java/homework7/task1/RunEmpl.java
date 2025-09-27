package homework7.task1;

import java.util.Arrays;

public class RunEmpl {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("1",400,"46872"),
                new ContractEmployee("2",22000,"16847"),
                new SalariedEmployee("3", 600, "96843"),
                new ContractEmployee("4", 23000, "35416")
        };

        Arrays.sort(employees);
        System.out.println("Employees are sorted by Salary: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
