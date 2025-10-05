package ex1hw9;
public class PersonMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Mary", "Lambda", 19) {
            @Override
            public String activity() {
                return "Activity = Sleep";
            }
        };

        Student st1 = new Student("Mark", "Bloha", 19, 8) {
            @Override
            public String activity() {
                return "Activity = studies";
            }
        };
        Student st2 = new Student("John", "Smith", 20, 10){
            @Override
            public String activity() {
                return "Activity = studies";
            }
        };
        Student copyStudent = (Student) st1.clone();
        copyStudent.setCourse(2);

        System.out.println(person1.activity() + "\n" + person1.info());
        System.out.println(st1.activity() + "\n" + st1.info());
        System.out.println(st2.activity() + "\n" + st2.info());
        System.out.println(copyStudent.activity() + "\n" + copyStudent.info());



    }
}
