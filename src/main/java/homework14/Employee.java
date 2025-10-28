package homework14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    String name;


    static Optional<String> mostPopularName(Stream< Employee> employees) {
        if (employees == null) {
            return Optional.empty();
        }

        return employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        Stream< Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Sam"),
                new Employee("Din"),
                new Employee("Din"),
                new Employee("Din"),
                new Employee("Bob"),
                new Employee("Sam")
        );
        System.out.println(mostPopularName(employees));
    }
}
