package com.softserve.academy.module12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb
                .append(" ")
                .append("Java")
                .append("!");
        String res = sb.toString();
        System.out.println(res);
    }
}
