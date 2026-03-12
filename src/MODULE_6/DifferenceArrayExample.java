package MODULE_6;
import java.util.Arrays;

public class DifferenceArrayExample {

    public static void rangeUpdate(int[] diff, int L, int R, int val) {
        diff[L] += val;

        if (R + 1 < diff.length) {
            diff[R + 1] -= val;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 40};
        int n = arr.length;

        int[] diff = new int[n];

        // Construct difference array
        diff[0] = arr[0];
        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        // Perform range updates
        rangeUpdate(diff, 1, 3, 10);  // add 10 to index 1..3
        rangeUpdate(diff, 0, 2, 5);   // add 5 to index 0..2

        // Rebuild the final array using prefix sum
        arr[0] = diff[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + diff[i];
        }

        System.out.println("Updated Array: " + Arrays.toString(arr));
    }
}