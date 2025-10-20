package com.softserve.academy.module12;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello Java!";


        String str2 = new String("Hello Java!").intern();
        String str3 = "Hello " + "Java!";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println("**".repeat(10));

        Integer a = 128;
        Integer b = 128;

        System.out.println(a == b);

        char[] chA = {'A', 'B', 'C', 'D', 'E'};
        String str4 = new String(chA);

        String str5 = new String(chA, 1, 3);
        System.out.println(str4);
        System.out.println(str5);

        String str6 = "A\uD83D\uDE0A";
        System.out.println(str6);
        System.out.println(str6.length());

        String str7 = "\uD83D\uDE0A";
        int codePoint = str7.codePointAt(0);
        System.out.println(codePoint);
        System.out.println(Integer.toHexString(codePoint));


        String str = "  I study Java language  ";
        int numberJ = str.indexOf('J');
        System.out.println(numberJ);
        char char8 = str.charAt(8);
        System.out.println(char8);
        String str8 = str.substring(13);
        System.out.println(str8);
        String str9 = str.substring(8, 12);
        System.out.println(str9.length());
        System.out.println(str9);
        String str10 = str9.toUpperCase();
        System.out.println(str10);
        String trimStr = str.strip();//or trim()
        System.out.println(trimStr);
        System.out.println(str);
        String rStr9 = str9.replace('J','j');
        System.out.println(rStr9);

    }
}
