package com.softserve.academy.homework10;

public class TextFormatter {
    public static String buildReport(String[] names) {
        if (names == null || names.length == 0) {
            return "No data available";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            sb.append(i + 1).append(". ").append(names[i]);
            if (i < names.length - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] names1 = {"Alice", "Bob", "Carol"};
        System.out.println(buildReport(names1));
        // Output:
        // 1. Alice
        // 2. Bob
        // 3. Carol

        String[] names2 = {};
        System.out.println(buildReport(names2));

        System.out.println(buildReport(null));
    }
}
