package com.softserve.academy.homework9;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Oleksandr", "Romaniuk"), 20, 3);
        System.out.println(student1.info() + "\n" + student1.activity());
        Student student2 = new Student(new FullName("Denys", "Soloviy"), 19, 2);
        System.out.println(student2.info() + "\n" + student2.activity());
        Student student3 = student1.clone();
        student3.setCourse(4);
        System.out.println("\n After clonning the student:");
        System.out.println(student1.info() + "\n" + student1.activity());
        System.out.println(student2.info() + "\n" + student2.activity());
        System.out.println(student3.info() + "\n" + student3.activity());
    }
}
