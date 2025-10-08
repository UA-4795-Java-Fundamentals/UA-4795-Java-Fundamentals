package com.softserve.academy.module10;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> textList =new ArrayList<>();
        textList.add("One");
        textList.add("Two");
        textList.addFirst("Zero");
        textList.add(1,"New value");
        System.out.println(textList);
        textList.remove(1);
        System.out.println(textList);

        System.out.println(textList.get(1));

        textList.set(1,"New");
        System.out.println(textList);

        List intNumber = new ArrayList();



    }
}
