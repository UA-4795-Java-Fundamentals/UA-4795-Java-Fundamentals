package com.softserve.academy.module9;

public class Person implements Cloneable {
    private int age;
    private FullName name;

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.name = new FullName(firstName, lastName);
    }

    public class FullName {
        String firstName;
        String lastName;

        FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        String getFormatted() {
            return firstName + " " + lastName;
        }

        public String getInitials() {
            return (firstName.charAt(0) + "." + lastName.charAt(0) + ".").toUpperCase();
        }

        @Override
        public String toString() {
            return "FullName{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

    public void printInfo() {
        System.out.println(name.getFormatted() + " (" + name.getInitials() + ") " + age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(FullName name) {
        this.name = name;
    }
}

class DemoPerson {
    public static void main(String[] args) {
        Person person1 = new Person(30, "Alice", "Green");
        System.out.println("Original person:");
        person1.printInfo();
        Person copyOfPerson = null;
        System.out.println("Cloned person: ");
        try {
            copyOfPerson = (Person) person1.clone();
            System.out.println(copyOfPerson);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        copyOfPerson.setName(copyOfPerson.new FullName("Bob", "Brown"));
        System.out.println(person1);
        System.out.println(copyOfPerson);


    }

}
