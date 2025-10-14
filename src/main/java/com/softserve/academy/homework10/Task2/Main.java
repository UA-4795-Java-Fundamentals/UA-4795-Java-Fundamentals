package com.softserve.academy.homework10.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Slavik", "MT-22", 2, new ArrayList<>(Arrays.asList(3, 4, 3, 3, 3, 2, 2, 3))));
        students.add(new Student("Denys", "MT-31", 3, new ArrayList<>(Arrays.asList(5, 5, 4, 3, 3, 5, 5, 4))));
        students.add(new Student("Sasha", "PM-24", 2, new ArrayList<>(Arrays.asList(2, 3, 2, 3, 3, 2, 2))));
        students.add(new Student("Slavik", "MT-51", 5, new ArrayList<>(Arrays.asList(4, 4, 4, 5, 3, 2, 5, 4))));
        students.add(new Student("Mark", "MM-33", 3, new ArrayList<>(Arrays.asList(3, 3, 3, 3, 3))));
        students.add(new Student("Oleksandr", "FF-44", 4, new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5, 5, 5, 5))));
        students.add(new Student("Olya", "MT-22", 2, new ArrayList<>(Arrays.asList(4, 4, 4, 3, 3, 4, 5, 3, 5, 4, 4))));

        System.out.println("Students before removing: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        for (int j = 0; j < students.size(); j++) {
            if (students.get(j).getAverageGrade() < 3) {
                students.remove(j);
            }
        }

        System.out.println("\nStudents after removing: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        printStudents(students, 2);
        printStudents(students, 3);
        printStudents(students, 4);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students that are enrolled in " + course + " course: ");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println(students.get(i).getName());
            }
        }
    }
}
