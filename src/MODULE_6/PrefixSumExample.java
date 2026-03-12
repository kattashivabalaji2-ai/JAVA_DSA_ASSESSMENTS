package MODULE_6;
public class PrefixSumExample {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3};

        int n = arr.length;
        int[] prefix = new int[n];

        // Construct prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Range sum query from L to R
        int L = 1;
        int R = 3;

        int sum;
        if (L == 0)
            sum = prefix[R];
        else
            sum = prefix[R] - prefix[L - 1];

        System.out.println("Sum from index " + L + " to " + R + " = " + sum);
    }
}