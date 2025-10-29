package com.softserve.academy.module15;

public class ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DemoTask());
        System.out.println("After creation " + thread.getState());
        thread.start();
        System.out.println("After start " + thread.getState());

        Thread.sleep(100);
        System.out.println("While running " + thread.getState());

        Thread.sleep(2000);
        System.out.println(" Sleep / wait " + thread.getState());

        thread.join();
        System.out.println("In the end " + thread.getState());

    }
    static class DemoTask implements Runnable {
        @Override
        public void run(){
            System.out.println("We are inside run()");
            try {
                Thread.sleep(1500);
                System.out.println("Woke up and finishing task");
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

        }
    }
}

