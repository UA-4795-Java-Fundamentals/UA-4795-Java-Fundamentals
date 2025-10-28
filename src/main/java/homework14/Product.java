package homework14;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product {
    String manufactureCategory;
    LocalDate dateOfManufacture;
    double price;

    public boolean isManufacturedMoreThanOneYearAgo(){
        return ChronoUnit.YEARS.between(dateOfManufacture, LocalDate.now()) > 1;
    }


    public static void sortByPrice(List<Product> products) {
        products.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(Product::isManufacturedMoreThanOneYearAgo)
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);
    }
}

class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Phone", LocalDate.of(2022, 5, 15), 4500.0),
                new Product("Phone", LocalDate.of(2022, 5, 15), 3500.0),
                new Product("Phone", LocalDate.of(2023, 1, 10), 4500.0),
                new Product("Phone", LocalDate.of(2021, 8, 20), 2800.0),
                new Product("TV", LocalDate.of(2022, 3, 5), 5500.0),
                new Product("TV", LocalDate.of(2023, 2, 15), 4800.0),
                new Product("Phone", LocalDate.of(2024, 12, 1), 2200.0),
                new Product("Laptop", LocalDate.of(2023, 4, 20), 12000.0),
                new Product("Phone", LocalDate.of(2021, 11, 30), 3800.0),
                new Product("Phone", LocalDate.of(2019, 6, 10), 2500.0),
                new Product("Phone", LocalDate.of(2022, 7, 25), 4200.0),
                new Product("Phone", LocalDate.of(2021, 3, 15), 3700.0),
                new Product("Laptop", LocalDate.of(2023, 5, 1), 6500.0),
                new Product("Laptop", LocalDate.of(2022, 9, 10), 5200.0),
                new Product("Tablet", LocalDate.of(2023, 3, 5), 3100.0),
                new Product("Tablet", LocalDate.of(2022, 11, 20), 5800.0),
                new Product("Phone", LocalDate.of(2025, 4, 5), 2900.0),
                new Product("Phone", LocalDate.of(2025, 12, 15), 3300.0),
                new Product("Laptop", LocalDate.of(2023, 1, 25), 7200.0),
                new Product("Laptop", LocalDate.of(2021, 7, 30), 4800.0),
                new Product("Phone", LocalDate.of(2021, 2, 28), 4600.0)
        );
        Product.sortByPrice(products);
    }
}
