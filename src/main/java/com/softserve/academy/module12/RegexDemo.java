package com.softserve.academy.module12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-Z]+");
        Matcher m = p.matcher("Now is the fall");

        while (m.find()) {
            System.out.println(m.group());

        }
    }
}
