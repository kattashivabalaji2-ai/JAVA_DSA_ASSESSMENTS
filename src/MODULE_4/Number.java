package MODULE_4;

final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

class Parent {

    final int number = 10;

    final void showMessage() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {


    void displayNumber() {
        System.out.println("Final variable value: " + number);
    }
}

public class Number {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.displayNumber();
        obj.showMessage();

        FinalClass fc = new FinalClass();
        fc.display();
    }
}