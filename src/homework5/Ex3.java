import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        int[] ex3numbers = new int[5];
        int secondPositiveNumber = 0;
        int minNumber=ex3numbers[0];
        int minNumberPosition = 0;
        int proizvod = 1;
        for (int i = 0; i < ex3numbers.length; i++) {
            ex3numbers[i] = (int) (Math.random() * 200)-100;
            System.out.print(" " + ex3numbers[i]);
        }
        System.out.println("");



        for (int i = 0, j = 0; i < ex3numbers.length && j<2; i++) {
            if (ex3numbers[i] > 0) {
                j++;
                secondPositiveNumber = i;
            }
        }
        if (ex3numbers[secondPositiveNumber] < 0) {
            System.out.println("\nНет положительных чисел");
        } else {
            System.out.println("\nВторое положительное число " + ex3numbers[secondPositiveNumber] + " позиция второго положительного числа " + secondPositiveNumber);
        }


        for (int i = 0; i < ex3numbers.length; i++) {
            if (ex3numbers[i] < minNumber) {
                    minNumber = ex3numbers[i];
                    minNumberPosition = i;
                }
            }
        for (int ex3number : ex3numbers) {
        if (ex3number % 2 == 0 && ex3number != 0) {
            proizvod *= ex3number;
        }
    }
        System.out.println("\nПроизведение четных чисел " + proizvod + "\n");
        System.out.println("Минимальное число " + minNumber + " Позиция минимального числа " + minNumberPosition);

    }


    }

