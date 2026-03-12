package MODULE_7;
import java.util.Arrays;

public class BinarySearchCombined {

    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return -1; // target not found
    }

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // target not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // target found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);

        int iterativeResult = binarySearchIterative(arr, target);
        System.out.println("Iterative Binary Search: Index " + iterativeResult);

        int recursiveResult = binarySearchRecursive(arr, target, 0, arr.length - 1);
        System.out.println("Recursive Binary Search: Index " + recursiveResult);
    }
}