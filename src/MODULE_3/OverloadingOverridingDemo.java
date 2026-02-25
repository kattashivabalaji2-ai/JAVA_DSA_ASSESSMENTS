package MODULE_3;
class MathOperation {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class Vehicle {

    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {

    @Override
    void move() {
        System.out.println("Car is moving fast");
    }
}

public class OverloadingOverridingDemo {
    public static void main(String[] args) {

        // Method Overloading
        MathOperation mo = new MathOperation();
        System.out.println("Multiply 2 numbers: " + mo.multiply(2, 3));
        System.out.println("Multiply 3 numbers: " + mo.multiply(2, 3, 4));

        // Method Overriding
        Vehicle v = new Car();
        v.move();
    }
}