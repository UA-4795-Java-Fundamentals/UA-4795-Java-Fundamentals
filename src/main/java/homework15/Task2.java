package homework15;


public class Task2 {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void methodA() {
        synchronized (lock1) {
            System.out.printf("%s: locked lock1\n", Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock2) {
                System.out.printf("%s: locked lock2\n", Thread.currentThread().getName());
            }
        }
    }

    public void methodB() {
        synchronized (lock2) {
            System.out.printf("%s: locked lock2\n", Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock1) {
                System.out.printf("%s: locked lock1\n", Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task2 example = new Task2();

        Thread t1 = new Thread(example::methodA, "Thread-A");
        Thread t2 = new Thread(example::methodB, "Thread-B");

        t1.start();
        t2.start();


        t1.join();
        t2.join();


        System.out.println("Main thread finished");
    }

}





