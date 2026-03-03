package MODULE_5;
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is Running");

        try {

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " woke up from sleep");

            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " working: " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " is Terminating");
    }
}

public class Lifecycle {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        System.out.println("State of t1 after creation: " + t1.getState());

        t1.start();
        System.out.println("State of t1 after start(): " + t1.getState());

        Thread.sleep(500);
        System.out.println("State of t1 during sleep: " + t1.getState());

        t1.join();
        System.out.println("State of t1 after completion: " + t1.getState());
    }
}