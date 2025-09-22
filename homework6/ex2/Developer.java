package ex2;

public class Developer extends Employee{

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

   @Override
    public String report() {
        super.report();
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.", name, age, salary);
    }
}
