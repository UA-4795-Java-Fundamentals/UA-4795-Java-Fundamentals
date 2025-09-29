package com.softserve.academy.module7;

import lombok.*;

import java.util.Arrays;

//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode()
//@ToString()
//public class Student {
//    private String name;
//    private int age;
//}

public record Student(String name, String lastName, int age) implements Comparable {

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student other) {
            int nameCompare = this.name.compareTo(other.name);
            int lastNameCompare = this.lastName.compareTo(other.lastName);
            return (nameCompare != 0 && lastNameCompare!=0) ? nameCompare : Integer.compare(this.age, other.age);
        }
        throw new IllegalArgumentException("Cann`t compare Student with " + o.getClass());

    }
}

class Demo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Anna", "Green", 17),
                new Student("Alice", "Brown", 19)
        };

        for (Student s : students) {
            System.out.println(s);
        }

        Arrays.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
