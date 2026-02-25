package MODULE_1;
import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=in.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
