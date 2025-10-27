package ex1hw10;

import java.util.ArrayList;
import java.util.Random;

public class MyCollection {
    public static void main(String[] args) {
        Random random = new Random(100);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(200) - 100);
        }
        System.out.println(list);

        //• Поменяйте местами максимальный и минимальный элементы списка.
        int min = list.get(0);
        int max = list.get(0);
        int placeMin = 0;
        int placeMax = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        placeMin = list.indexOf(min);
        placeMax = list.indexOf(max);
        System.out.println("Min = " + min + " PlaceMin = " + placeMin +
                "\nMax = " + max + " PlaceMax = " + placeMax);
        list.set(placeMin, max);
        list.set(placeMax, min);
        System.out.println("Поменяли максимальный и минимальный элементы\n " + list);

        //• Вставьте случайное трёхзначное число перед первым отрицательным элементом списка.
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, random.nextInt(1000));
                break;
            }
        }
        System.out.println("Вставили случайное трехзначное число \n" + list);
//• Вставьте ноль между всеми соседними элементами коллекции myCollection с разными знаками.
        ArrayList<Integer> list0 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list0.add(list.get(i));
            if ((i + 1 <= list.size() - 1) && ((list.get(i) > 0 && list.get(i + 1) < 0) ||
                    (list.get(i) < 0 && list.get(i + 1) > 0))) {
                list0.add(0);
            }
        }
        System.out.println("С нулями \n" + list0);

        //• Скопируйте первые k элементов коллекции myCollection в список list1 в прямом порядке,
        // а остальные — в список list2 в обратном порядке.
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int k = random.nextInt(list.size());
        for (int i = 0; i < k; i++) {
            list1.add(list.get(i));
        }
        for (int i = list.size() - 1; i >= k; i--) {
            list2.add(list.get(i));
        }
        System.out.println("k = " + k);
        System.out.println("List 1 \n" + list1);
        System.out.println("List 2 \n" + list2);

        //• В списке myCollection удалите последний чётный элемент
        // (если в списке есть чётные элементы). Если такого элемента нет, выведите сообщение.
        int el = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                el = list.get(i);
            }
        }
        if (el == 1) {
            System.out.println("Четных чисел нет");
        } else {
            System.out.println("Последний четный элемент = " + el);
        }

        //• Удалите из списка myCollection элемент, следующий за первым минимальным.
        // Если минимальный элемент — последний, удалять ничего не нужно.
        System.out.println("Фин таска\n" + list);
        int size = list.size()-1;
        if (placeMin < size){
        list.remove(placeMin + 1);
        System.out.println("Удалили элемент после минимального\n" +list);}
        else {
            System.out.println("Ничего не удалили");
        }


    }
}
