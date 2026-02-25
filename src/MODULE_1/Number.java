package MODULE_1;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=in.nextInt();
        if(a<0)
            System.out.println("Negative number");
        else if(a>0)
            System.out.println("Positive Number");
        else System.out.println("Zero");
    }
}
