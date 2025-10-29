package com.softserve.academy.module15;

public class Run1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (App.class) {
                App.sum--;
            }
        }
    }
}

class Run2 implements Runnable {
    @Override
    public void run() {
        synchronized (App.class) {
            for (int i = 0; i < 10000; i++) {
                App.sum++;
            }
        }
    }
}

class App {
    public static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new Run1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Run2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("sum is " + sum);
    }


}
