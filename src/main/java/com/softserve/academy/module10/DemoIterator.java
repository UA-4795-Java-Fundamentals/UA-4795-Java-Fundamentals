package com.softserve.academy.module10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Alice");
        names.add("Bob");
        names.add("Mike");
        names.add("Alice");
        names.add("Nick");

        Iterator<String> it = names.iterator();
        System.out.println("Our names");
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name + " ");

            if (name.equals("Alice")) {
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("*-*".repeat(5));
        for (String name : names) {
            System.out.println(name + " ");

        }
    }
}
