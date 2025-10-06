package homework9.task2;

import homework9.task1.FullName;


public class RunStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        FullName name1 = new FullName("John", "Doe");
        Student st1 = new Student(name1, 19, 1);
        FullName name2 = new FullName("Max", "Johnson");
        Student st2 = new Student(name2, 20, 2);
        System.out.println(st1.activity());
        System.out.println(st1.info());
        System.out.println("===========");
        System.out.println(st2.activity());
        System.out.println(st2.info());
        System.out.println("==================");
        System.out.println("Clone student");
        Student stClone = st2.clone();
        stClone.setCourse(3);
        System.out.println(stClone.activity());
        System.out.println(stClone.info());

    }
}
