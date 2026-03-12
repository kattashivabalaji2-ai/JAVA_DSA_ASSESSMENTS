package MODULE_6;
import java.util.Arrays;

public class EvenOddRearrange {

    public static void rearrange(int[] arr) {
        int n = arr.length;
        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < n && oddIndex < n) {

            // Find the first evenIndex which is not even
            while (evenIndex < n && arr[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }

            // Find the first oddIndex which is not odd
            while (oddIndex < n && arr[oddIndex] % 2 != 0) {
                oddIndex += 2;
            }

            // Swap misplaced elements
            if (evenIndex < n && oddIndex < n) {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;

                evenIndex += 2;
                oddIndex += 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 12, 1, 5, 8};

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }
}