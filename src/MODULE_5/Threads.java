package MODULE_5;

class ThreadClassExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running using Thread class.");
    }
}

class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running using Runnable interface.");
    }
}

public class Threads {
    public static void main(String[] args) {

        ThreadClassExample t1 = new ThreadClassExample();
        t1.start();

        RunnableExample r = new RunnableExample();
        Thread t2 = new Thread(r);
        t2.start();
    }
}