package homework2.run;

import homework2.Person;

public class RunPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.input();
        person.getAge();
        System.out.println("==================================================================");
        person.output();
        System.out.println("==================================================================");
        System.out.println("Changed first and last name");
        person.changeName("Viktor", "viktor");
        person.output();
    }
}
