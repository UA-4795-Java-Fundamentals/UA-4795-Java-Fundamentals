package com.softserve.academy.homework11.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Slavko", 3));
        students.add(new Student("Oleksandr", 3));
        students.add(new Student("Vasyl", 1));
        students.add(new Student("Denys", 4));
        students.add(new Student("Nazar", 5));

        Student.printStudents(students, 3);

        students.sort(Student.compareByName);
        System.out.println("\nStudents sorted by name: ");
        for (Student s : students) {
            System.out.println(s.getName() + " entrolled in " + s.getCourse() + " course");
        }

        students.sort(Student.compareByCourse);
        System.out.println("\nStudents sorted by course: ");
        for (Student s : students) {
            System.out.println(s.getName() + " entrolled in " + s.getCourse() + " course");
        }

    }
}
