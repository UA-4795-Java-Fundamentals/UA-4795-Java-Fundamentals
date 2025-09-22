package homework6.task2;

public class RunEmplo {
    public static void main(String[] args) {
        Employee em = new Employee("Artem", 21, 24567.3);
        Developer dev = new Developer("Taras", 32, 32735.45, "Average java developer");

        System.out.println(em.report());
        System.out.println(dev.report());
    }
}
