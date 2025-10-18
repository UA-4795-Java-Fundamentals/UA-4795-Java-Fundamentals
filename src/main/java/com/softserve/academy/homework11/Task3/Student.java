package com.softserve.academy.homework11.Task3;

import java.util.List;
import java.util.Comparator;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students that are enrolled in " + course + " course:");
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    public static Comparator<Student> compareByName = (s1, s2) -> s1.getName().compareTo(s2.getName());
    public static Comparator<Student> compareByCourse = Comparator.comparingInt(Student::getCourse);
}
