package MODULE_4;
public class Strbuilder {
    public static void main(String[] args) {
        String original = "Hello World";

        StringBuilder sb = new StringBuilder(original);

        sb.reverse();

        String reversed = sb.toString();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}