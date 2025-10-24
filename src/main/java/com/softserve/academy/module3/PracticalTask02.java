package main.java.com.softserve.academy.module3;

public class PracticalTask02 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Alice");
        employee1.setRate(15.0);
        employee1.setHours(7);

        Employee employee2 = new Employee("Bob", 10.0, 12);

        Employee employee3 = new Employee("Jack", 10.0, 2);
        System.out.println("Employee1 = " + employee1);
        System.out.println("Employee2 = " + employee2);
        System.out.println("Employee3 = " + employee3);
        System.out.println(Employee.getTotalSum());
    }
}
    class Employee {
        private static final double BONUS_RATE = 0.1; // 10% from Salary
        private static double totalSum = 0.0;
        private String name;
        private double rate;
        private int hours;

        public Employee() {
        }

        public Employee(String name, double rate) {
            this.name = name;
            this.rate = rate;
        }

        public Employee(String name, double rate, int hours) {
            this.name = name;
            setRate(rate);
            setHours(hours);
        }

        public double getSalary() {
            return getRate() * getHours();
        }

        public double getBonuses() {
            return BONUS_RATE * getSalary();
        }

        public String toString() {
            return "Employee{" +
                    "name ='" + name + '\'' +
                    ", rate =" + rate +
                    ", hours=" + hours +
                    ", salary =" + getSalary() +
                    ", bonuses =" + getBonuses() + '}';
        }

        public void setRate(double rate) {
            double oldSalary = getSalary();
            this.rate = rate;
            double newSalary = getSalary();
            totalSum -= oldSalary;
            totalSum += newSalary;
        }

        public void setHours(int hours) {
            double oldSalary = getSalary();
            this.hours = hours;
            double newSalary = getSalary();
            totalSum -= oldSalary;
            totalSum += newSalary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static double getTotalSum() {
            return (1 + BONUS_RATE) * totalSum;
        }

        public double getRate() {
            return rate;
        }

        public int getHours() {
            return hours;
        }


    }