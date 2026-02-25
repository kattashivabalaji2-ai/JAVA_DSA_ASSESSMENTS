package MODULE_1;
//Write a program that takes a student's marks as input and prints the corresponding
//grade (A, B, C, D, or F) using a switch statement.
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the marks");
        int marks=in.nextInt();
        switch(marks/10){
            case 9:
            case 8:
                System.out.println("Grade A");
                break;
            case 7:
                System.out.println("Grade B");
                break;
            case 6:
                System.out.println("Grade C");
                break;
            case 5:
            case 4:
                System.out.println("Grade D");
                break;
            case 3:
            case 2:
            case 1:
                System.out.println("Grade E");
                break;
            default:
                System.out.println("Invalid Marks");
        }
    }
}
