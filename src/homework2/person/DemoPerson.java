package person;

import java.util.Scanner;

public class DemoPerson {
    private String firstName;
    private String lastName;
    private int birthYear;

    public DemoPerson(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public DemoPerson(){
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear <= 0) {
            System.out.println("Wrong birth year!");
            return;
        }
        this.birthYear = birthYear;
    }

    public int getAge(){
        if (birthYear <= 0) {
            return 0;
        } else
            return 2025 - birthYear;
    }

    public void inPut(){
        System.out.print("Enter first name: ");
        firstName = new Scanner(System.in).nextLine();
        System.out.print("Enter last name: ");
        lastName = new Scanner(System.in).nextLine();
        System.out.print("Enter birth year: ");
        birthYear = new Scanner(System.in).nextInt();
    }
    public void outPut(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + getAge());
    }
    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }


}
