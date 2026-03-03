package MODULE_4;
class Demo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called for object.");
    }
}

public class Main {
    public static void main(String[] args) {

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        System.gc();

        System.out.println("End of main method.");
    }
}