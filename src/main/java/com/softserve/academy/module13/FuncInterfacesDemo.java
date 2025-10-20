package com.softserve.academy.module13;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class FuncInterfacesDemo {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> (x > 0);

        int[] arr = {-3, -8, -18, 0, 3, 15, 24, -48, -52, 52, 100};
        System.out.println("Only positive values: ");
        for (int x : arr) {
            if (isPositive.test(x)) {
                System.out.println(x);
            }

        }

        Predicate<Integer> isEven = x -> (x % 2 == 0);
        int sum = 0;
        for (int x : arr) {
            if (isEven.test(x)) {
                sum += x;
            }
        }
        System.out.println(sum);

        Function<String, Integer> lengthFunc = String::length;
        String[] words = {"java", "functional", "interfaces"};
        for (String word : words) {
            int len = lengthFunc.apply(word);
            System.out.println(word + " has length " + len);
        }

        Consumer<String> greeter = names -> System.out.println("Hello, " + names + "!");
        String[] names = {"Alice", "Bob", "Davide"};
        for (String n : names) {
            greeter.accept(n);
        }
        Supplier<LocalDate> today = LocalDate::now;
        System.out.println(today.get());

        UnaryOperator<Integer> square = x -> x * x;
        for (int v : arr) {
            System.out.println(square.apply(v));
        }

        List<String> fruits = Arrays.asList("apple", "Apple", "bluberry", "Chery", "Banana");
        //Collections.sort(fruits, String::compareToIgnoreCase);
        fruits.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println(fruits);

        Consumer<String> print = System.out::println;
        print.accept("Hello!");
        System.out.println(LocalDate.of(2000, Month.OCTOBER,20));
    }
}
