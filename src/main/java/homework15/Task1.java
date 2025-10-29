package homework15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Task1 implements Runnable {
    String message;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s: %s\n", Thread.currentThread().getName(), message);
        }
    }


    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Task1("Helo"));
        Thread t2 = new Thread(new Task1("World"));
        Thread t3 = new Thread(new Task1("Java"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }

}
