package com.softserve.academy.module10;

import java.util.*;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();

        students.put(1, "Alice");
        students.put(1, "Bob");
        students.put(3, "Charlie");
        students.put(4, "Mike");
        students.put(5, "Alex");
        students.put(6, null);
       // students.put(null, "Alice");

        System.out.println(students);
        System.out.println("*-*".repeat(5));
        System.out.println(students.get(3));

        System.out.println(students.containsKey(7));
        System.out.println(students.containsValue("Sara"));

        students.remove(6);
        System.out.println(students);
        System.out.println("*-*".repeat(5));
        for(Map.Entry<Integer,String> entry : students.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
       

    }
}
