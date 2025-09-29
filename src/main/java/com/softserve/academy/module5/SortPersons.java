package com.softserve.academy.module5;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SortPersons {
    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Anna", 18),
                new Person("Bohdan", 16),
                new Person("Oksana", 21),
        };
        for (int i = 0; i < peoples.length - 1; i++) {
            for (int j = 0; j < peoples.length - i - 1; j++) {
                if (peoples[j].age > peoples[j + 1].age) {
                    Person temp = peoples[j];
                    peoples[j] = peoples[j + 1];
                    peoples[j + 1] = temp;
                }
            }
        }
        for (Person p : peoples) {
            System.out.println(p);
        }

    }
}

