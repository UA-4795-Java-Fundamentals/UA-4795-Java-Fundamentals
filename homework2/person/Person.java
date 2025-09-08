package person;

public class Person {
    public static void main(String[] args) {
        DemoPerson person1 = new DemoPerson();
        DemoPerson person2 = new DemoPerson();
        DemoPerson person3 = new DemoPerson();
        DemoPerson person4 = new DemoPerson();
        DemoPerson person5 = new DemoPerson();

        person1.setFirstName("Ivan");
        person1.setLastName("Ivanov");
        person1.setBirthYear(1997);

        person2.setFirstName("Petr");
        person2.setLastName("Petrov");
        person2.setBirthYear(1990);

       person3.inPut();

        person4.changeName("Vladislav", "Vladislavov");
        person5.changeName("Alexander", "Alexandrov");

        person1.outPut();
        person2.outPut();
        person3.outPut();
        person4.outPut();
        person5.outPut();
    }
}
