package com.softserve.academy.module9.stat;

public class Person {
    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class PersonValidator {
        public static Person createIfValid(String name, int age) {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Name cann`t  be Empty");
            }
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException(" Age must be from 0 to 120");
            }
            return new Person(name, age);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class DemoPerson {
    public static void main(String[] args) {
        Person person1 = Person.PersonValidator.createIfValid("Alice", -30);
        System.out.println(person1);
    }

}