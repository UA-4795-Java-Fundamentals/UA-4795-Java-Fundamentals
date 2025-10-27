package ex2hw10;

import java.util.*;

public class Ex2Main {

    public static void main(String[] args) {
        List<Student10> students = new ArrayList<>();
        students.add(new Student10("Mark", "A-201", 1, List.of(3,4,5)));
        students.add(new Student10("Alice", "A-01", 1, List.of(1,2)));
        students.add(new Student10("Bob", "A-01", 1, List.of(1,2,3)));
        students.add(new Student10("Frank", "A-201", 2, List.of(4,5)));
        students.add(new Student10("Murchik", "1-201", 3, List.of(5,5,5,5,5,5)));
        System.out.println("До обработки:");
        students.forEach(System.out::println);

        Student10.processStudents(students);

        System.out.println("\nПосле обработки:");
        students.forEach(System.out::println);

        System.out.println();
        Student10.printStudents(students, 2);
        Student10.printStudents(students, 3);
        Student10.printStudents(students, 4);

    }
}
