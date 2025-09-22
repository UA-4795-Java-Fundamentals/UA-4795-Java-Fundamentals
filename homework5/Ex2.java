//10 целых чисел и вычисляет сумму первых пяти элементов, если они положительные, или
//произведение последних пяти элементов, если они отрицательные, и выводит результат.
//        • 5 целых чисел и находит:
// Не понятно описание задания. Так что описание задачи переделано
/*
Вычисляем сумму первых 5 положительных чисел и произведение последних пяти отрицательных

 */


import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        int[] randomNumbers2 = new int[6];
        int[] randomNumbers3 = new int[6];

        int sum = 0;
        int proizvod = 1;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 200)-100;
        }
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(" " + randomNumbers[i]);
        }
        for (int i = 0, j=0; i < randomNumbers.length && j < randomNumbers2.length-1; i++) {
            if (randomNumbers[i] > 0) {
                j++;
                randomNumbers2[j] = randomNumbers[i];
                sum =randomNumbers2[j] + sum;
            }
        }
        for (int i = randomNumbers.length-1, j=0; i >= 0 && j < randomNumbers3.length-1; i--) {
            if (randomNumbers[i] < 0) {
                j++;
                randomNumbers3[j] = randomNumbers[i];
                proizvod = randomNumbers3[j] * proizvod;
            }
        }
        System.out.print("\nSum = " + sum + " proizvod = " + proizvod);
    }
}


