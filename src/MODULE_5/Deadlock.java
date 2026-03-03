package MODULE_5;
class Resource {
    String name;

    Resource(String name) {
        this.name = name;
    }

    synchronized void use(Resource other) {
        System.out.println(Thread.currentThread().getName() + " locked " + this.name);

        try {

            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " trying to lock " + other.name);
        synchronized (other) {
            System.out.println(Thread.currentThread().getName() + " locked " + other.name);
        }
    }
}

public class Deadlock{
    public static void main(String[] args) {
        Resource res1 = new Resource("Resource-1");
        Resource res2 = new Resource("Resource-2");

        Thread t1 = new Thread(() -> res1.use(res2), "Thread-1");

        Thread t2 = new Thread(() -> res2.use(res1), "Thread-2");

        t1.start();
        t2.start();
    }
}