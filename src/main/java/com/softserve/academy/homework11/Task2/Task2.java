package com.softserve.academy.homework11.Task2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Romaniuk", "Oleksandr");
        personMap.put("Romaniuk", "Volodymyr");
        personMap.put("Diakiv", "Volodymyr");
        personMap.put("Kolyada", "Orest");
        personMap.put("Rubaha", "Orest");
        personMap.put("Kusek", "Myroslav");
        personMap.put("Shvets", "Volodymyr");
        personMap.put("Shildt", "Herbert");
        personMap.put("Java", "Script");
        personMap.put("Soloviy", "Denys");

        System.out.println("People:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }

        boolean hasDuplicates = personMap.values().size() != personMap.values().stream().distinct().count();
        if (hasDuplicates)
            System.out.println("\nFound people with the same first name");
        else
            System.out.println("\nAll names are unique");

        String nameToRemove = "Orest";
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(nameToRemove));

        System.out.println("\nPeople after removing:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
