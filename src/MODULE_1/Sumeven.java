package MODULE_1;

public class Sumeven {
    public static void main(String[] args) {
        int n=0;
        int sum=0;
        while(n%2==0){
           sum=sum+n;
           n=n+2;
           if (n==102){
               break;
            }
        }
        System.out.println("Sum 1 to 100="+sum);
    }
}
