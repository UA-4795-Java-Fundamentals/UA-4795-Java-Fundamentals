package com.softserve.academy.module3;

public class DemoStudent {

    public static void main(String[] args) {
        Student st2 = new Student();
        Student st3 = new Student("Serhii", "Shevchenko");
        Student st4 = new Student("Petro", "Romaniv", 23);

        System.out.println(st4);
        st4.printInfo();
        System.out.println(st3);

        System.out.println(st2);

//        st2.setFirstName("Anna");
//        st2.setLastName("Demkiv");
//
//        st2.setAge(18);
//
//        st2.printInfo();
//        System.out.println(st2.getAge());
//        st3.setFirstName("Ihor");
//        System.out.println(Student.sumTwoNumbers(5,8));
//
//        System.out.println("Name Length " + st3.getFirstName().length());
//        Student.print();
//

    }
}
