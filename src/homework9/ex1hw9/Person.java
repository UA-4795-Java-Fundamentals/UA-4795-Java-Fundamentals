package ex1hw9;

public abstract class Person {
    private FullName fullName = new FullName();
    private int age;

    public Person(String firstName, String lastName , int age) {
        fullName.firstName = firstName;
        fullName.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String info(){
        return fullName.toString() + "\nAge " + age;
    }

    private class FullName {
        private String firstName;
        private String lastName;

        @Override
        public String toString() {
            return "FirstName " + firstName + '\n' + "LastName " + lastName;

        }
    }

    public FullName getFullName() {
        return fullName;
    }
    public abstract String activity();




}
