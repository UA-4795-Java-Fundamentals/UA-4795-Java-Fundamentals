package homework15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Task3 implements Runnable {
    private String threadName;
    private int count;


    @Override
    public void run() {
        if("one".equals(threadName)){
            Thread t2 = new Thread(new Task3("two", 3));
            t2.start();
            try{
               t2.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        } else {
            for(int i = 0; i < count; i++){
                System.out.println("Thread number " + threadName);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Task3("one", 1));
        t1.start();

        Thread t3 = new Thread(new Task3("three", 5));
        t3.start();

        t1.join();
        t3.join();
        System.out.println("Finished");
    }
}
