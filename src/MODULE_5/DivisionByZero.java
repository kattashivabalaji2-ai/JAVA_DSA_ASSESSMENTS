package MODULE_5;
public class DivisionByZero{
    public static void main(String[] args) {
        int numerator = 20;
        int denominator = 0;
        int result = 0;

        try {

            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
        } finally {

            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}