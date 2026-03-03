package MODULE_5;

// Custom Exception class
class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

// Class to demonstrate throwing custom exception
public class Main{

    // Method that checks age and may throw exception
    static void checkAge(int age) throws AgeInvalidException {
        if (age < 18) {
            // Throwing custom exception
            throw new AgeInvalidException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);  // This will throw exception
        } catch (AgeInvalidException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            checkAge(25);  // This is valid
        } catch (AgeInvalidException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}