package ex2;

public class MantDeveloper {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Ivan", 25, 3211);
        Developer developer2 = new Developer("Petar", 42, 1321);
        Developer developer3 = new Developer("Ivan", 37, 3453);
        Employee employee1 = new Employee("Lana", 19, 1045);
        Employee employee2 = new Employee("Mark", 34, 4959);
        Employee employee3 = new Employee("Busya", 22, 5100);

        Employee[] employees = {employee1, employee2, employee3, developer1, developer2, developer3};
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }

    }
}
