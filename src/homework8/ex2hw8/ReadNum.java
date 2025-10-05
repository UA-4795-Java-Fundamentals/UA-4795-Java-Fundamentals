package ex2hw8;

import java.util.Random;
import java.util.Scanner;

public class ReadNum {
    int start = 1;
    int end = 100;
    int number;
    static Random random = new Random();

    public int inPutNumber() {
        number = random.nextInt(200)-100;
        this.number = number;
        return number;
    }

    @Override
    public String toString() {
        return "Number " + number;
    }

    public int readNumber() throws ArithmeticException{
        if (number < end && number > start) {
            return number;
        } else return 0;
    }
}

