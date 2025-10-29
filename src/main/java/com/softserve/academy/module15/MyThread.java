package com.softserve.academy.module15;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Good evening from thread " + Thread.currentThread().getName());
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.setName("Our thread");
        t.start();
        System.out.println("Hello from main!");
    }
}
