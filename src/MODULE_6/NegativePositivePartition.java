package MODULE_6;
import java.util.Arrays;

public class NegativePositivePartition {

    public static void partitionArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            if (arr[left] < 0) {
                left++;
            }
            else if (arr[right] >= 0) {
                right--;
            }
            else {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, -5, 6, -1, 4};

        partitionArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}