package homework11;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Johnson", "Jane");
        personMap.put("Williams", "Liam");
        personMap.put("Jones", "Jacob");
        personMap.put("Brown", "Orest");
        personMap.put("Miller", "Liam");
        personMap.put("Wilson", "Alice");
        personMap.put("Taylor", "John");

        System.out.println(personMap);
        Collection<String> names = personMap.values();
        Set<String> uniqueNames = new HashSet<>();
        boolean hasDuplicates = false;
        for(String name : names) {
            if(!uniqueNames.add(name)) {
                hasDuplicates = true;
                System.out.println("Duplicate name: " + name);
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates");
        }
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if(entry.getValue().equals("Orest")) {
                System.out.println("Removing: " + entry.getKey() + " = " + entry.getValue());
                iterator.remove();
            }
        }

        System.out.println("Map after removal:");
        System.out.println(personMap);
    }

}
