package MODULE_2;
public class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Addition of 2 integers: " + add(10, 20));
        System.out.println("Addition of 3 integers: " + add(10, 20, 30));
        System.out.println("Addition of 2 doubles: " + add(5.5, 4.5));
    }
}