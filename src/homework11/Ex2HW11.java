
import java.util.HashMap;
import  java.util.Map;
public class Ex2HW11 {
        public static void main(String[] args) {
            Map<String, String> personMap = new HashMap<>();
            personMap.put("Johnson", "John");
            personMap.put("Smith", "Paul");
            personMap.put("Brown", "Anna");
            personMap.put("Walker", "Orest");
            personMap.put("Davis", "Maria");
            personMap.put("Miller", "John");
            personMap.put("Wilson", "Anton");
            personMap.put("Taylor", "Paul");
            personMap.put("Moore", "Helen");
            personMap.put("Clark", "Sergey");

            System.out.println("Map:");
            personMap.forEach((lastName, firstName) ->
                    System.out.println(lastName + " " + firstName));

            boolean hasDupNames = personMap.values().stream()
                    .distinct().count() < personMap.size();
            System.out.println("\nAre there duplicate first names? " + (hasDupNames ? "Yes" : "No"));
            personMap.values().removeIf(name -> name.equals("Orest"));
            System.out.println("\nRemoving Orest:");
            personMap.forEach((lastName, firstName) ->
                    System.out.println(lastName + " " + firstName));
        }
    }


