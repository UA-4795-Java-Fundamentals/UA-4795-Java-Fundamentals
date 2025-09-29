package com.softserve.academy.module5;
import com.softserve.academy.module3.Student;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        long[] numbers = new long[5];
        numbers[0] = 1;
        numbers[1] = 19;
        numbers[2] = -4;
        numbers[3] = 42;
        numbers[4] = 55;
       // numbers[5] = 60;// here will be an exception ArrayIndexOfBound
        System.out.println(numbers); //here will be something like that [J@6f496d9f
        System.out.println(Arrays.toString(numbers));//[1, 19, -4, 42, 55]

        //another way to create an array
        String[] names = {"John", "Jane", "Jack", "Jennie"};
        System.out.println("Size of an array is " + names.length + " elements."); //size of an array
        System.out.println("The first an element is " + names[0]); //first an element
        System.out.println(Arrays.toString(names));

        Student[] students = new Student[3];
        students[0] = new Student("John", "Ostin",19);
        students[1] = new Student("Jane", "Jack",22);
        students[2] = new Student("Jennie", "Jack",25);
        System.out.println(Arrays.toString(students));//[Student{firstName='John', lastName='Ostin', age=19}, Student{firstName='Jane', lastName='Jack', age=22}, Student{firstName='Jennie', lastName='Jack', age=25}]
//


        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 19;
        matrix[0][2] = -4;
        matrix[1][0] = 1;
        matrix[1][1] = 19;
        matrix[1][2] = 42;
        matrix[2][0] = 1;
        matrix[2][1] = 42;
        matrix[2][2] = 55;
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(matrix[1][2]);
        System.out.println("Size of an array is " + matrix.length + " elements.");


        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6},{1}};
        System.out.println(matrix2[0][2]);
        System.out.println(Arrays.deepToString(matrix2));


    }
}
