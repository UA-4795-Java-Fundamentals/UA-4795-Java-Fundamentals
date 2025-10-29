package com.softserve.academy.module15.thr;

public class MyThread extends Thread {
    private int number;
    private int pause;

    public MyThread(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + number);
        }
    }
}

class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread(1, 100);
        Thread t2 = new MyThread(2, 100);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Hello from main! ");

    }
}
