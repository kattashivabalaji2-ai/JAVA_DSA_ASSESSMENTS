package MODULE_1;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter three number:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
            if(a>b && a>c ){
                System.out.println(a+" is greatest");
            }
            else if(b>a && b>c){
                System.out.println(b+"is greatest");
            }
        else
            System.out.println(c+"is greatest");
    }
}
