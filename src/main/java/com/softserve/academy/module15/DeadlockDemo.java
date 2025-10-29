package com.softserve.academy.module15;

class DeadlockDemo extends Thread {
    final static Object first = new Object();
    final static Object second = new Object();
    static Thread t1 = new Thread() {
        @Override
        public void run() {
            synchronized (first) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
                synchronized (second) {
                    System.out.println("Success!");
                }
            }
        }
    };
    static Thread t2 = new Thread() {
        @Override
        public void run() {
            synchronized (second) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
                synchronized (first) {
                    System.out.println("Success!");
                }
            }
        }
    };

    public static void main(String[] s) throws InterruptedException {
        t1.start();
        t2.start();
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //t1.join();
        // t2.join();
        System.out.println(t1.getState()); // BLOCKED
        System.out.println(t2.getState()); // BLOCKED
        System.out.println("Main");
    }

}
