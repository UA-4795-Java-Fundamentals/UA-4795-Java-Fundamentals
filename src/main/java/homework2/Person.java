package homework2;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getAge() {
        int age = 2025 - birthYear;
        System.out.println("Method getAge(): " + age);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = in.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = in.nextLine();
        System.out.println("Enter Birth Year: ");
        int birthYear = in.nextInt();
        in.close();
        setFirstName(firstName);
        setLastName(lastName);
        setBirthYear(birthYear);
    }

    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + (2025 - birthYear));
    }


    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


}
