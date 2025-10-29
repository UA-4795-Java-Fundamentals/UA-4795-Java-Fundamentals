package com.softserve.academy.module15;

public class NewThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}

class Demo {
    public static void main(String[] args) {
        NewThread task = new NewThread();
        Thread t = new Thread(task);
        t.start();
        System.out.println("Hello from main");
    }

}