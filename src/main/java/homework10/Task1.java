package homework10;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new Random().ints(10, -10, 30).boxed().collect(Collectors.toList());
        System.out.println("Original list: " + myCollection);
        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        int maxIndex = myCollection.indexOf(max);
        int minIndex = myCollection.indexOf(min);

        List<Integer> colSwap = new ArrayList<>(myCollection);
        Collections.swap(colSwap, maxIndex, minIndex);
        System.out.println("After swap: " + colSwap);

        System.out.println("===".repeat(20));

        List<Integer> nc = new ArrayList<>(myCollection);
        int r = new Random().nextInt(100, 999);
        System.out.println("Random three-digit number: " + r);

        ListIterator<Integer> it = nc.listIterator();

        while(it.hasNext()){
            int current = it.next();
            if(current < 0){
                it.previous();
                it.add(r);
                break;
            }
        }
        System.out.println("After iterate: " + nc);

        System.out.println("===".repeat(20));

        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);
        System.out.println("First part of original list: " + list1);
        System.out.println("Reversed second part of original list " + list2);

        System.out.println("===".repeat(20));

        List<Integer> remEvenNum = new ArrayList<>(myCollection);
        int lastIndex = -1;
        for (int i = remEvenNum.size() - 1; i >= 0 ; i--) {
            if(remEvenNum.get(i) % 2 == 0){
                lastIndex = i;
                break;
            }
        }
        if(lastIndex != -1){
            remEvenNum.remove(lastIndex);
            System.out.println("After removing last even element: "  + remEvenNum);
        } else{
            System.out.println("No even element found");
        }

        System.out.println("===".repeat(20));

        List<Integer> remMin = new ArrayList<>(myCollection);
        int rMin = Collections.min(remMin);
        System.out.println("Min element: " + rMin);
        int minRemIndex = remMin.indexOf(rMin);
        if(minRemIndex != remMin.size() - 1){
            System.out.println("Remove: " + remMin.get(minRemIndex + 1));
            remMin.remove(minRemIndex + 1);
        } else{
            System.out.println("Minimum element is the last one — nothing removed");
        }
        System.out.println(remMin);
    }
}
