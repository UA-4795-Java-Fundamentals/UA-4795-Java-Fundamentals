package com.softserve.academy.homework10.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(100) - 50);
        }
        System.out.println("myCollection: " + myCollection);

        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        int maxIndex = myCollection.indexOf(max);
        int minIndex = myCollection.indexOf(min);
        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println("\nmyCollection after swap: " + myCollection);

        int randomThreeDigitNumber = random.nextInt(100, 999);
        for (int j = 0; j < myCollection.size(); j++) {
            if (myCollection.get(j) < 0) {
                myCollection.add(j, randomThreeDigitNumber);
                break;
            }
        }
        System.out.println("\nmyCollection after inserting three-digit number: " + myCollection);

        System.out.println("\nmyCollection: " + myCollection);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int k = 1; k < myCollection.size(); k++) {
            if (myCollection.get(k) < 0 && myCollection.get(k - 1) >= 0
                    || myCollection.get(k) >= 0 && myCollection.get(k - 1) < 0) {
                myCollection.add(k, 0);
                list1 = new ArrayList<>(myCollection.subList(0, k));
                list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
                break;
            }
            if (k == myCollection.size() - 1) {
                list1 = new ArrayList<>(myCollection.subList(0, myCollection.size() / 2));
                list2 = new ArrayList<>(myCollection.subList(myCollection.size() / 2, myCollection.size()));
            }
        }
        Collections.reverse(list2);
        System.out.println("myCollection: " + myCollection);
        System.out.println("list1: " + list1);
        System.out.println("list2" + list2);

        System.out.println("\nmyCollection before removing: " + myCollection);
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
            if (i == 0) {
                System.out.println("There are no even elements in the colletions.");
            }
        }
        int minElement = Collections.min(myCollection);
        int minElementIndex = myCollection.indexOf(minElement);
        if (minElementIndex != myCollection.size() - 1) {
            myCollection.remove(minElementIndex + 1);
        }
        System.out.println("myCollection after removing the next element to first minimum:" + myCollection);
    }
}
