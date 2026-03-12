package MODULE_7;
import java.util.Arrays;

public class FirstLastOccurrence {

    // Find first occurrence of target
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // keep searching in left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Find last occurrence of target
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // keep searching in right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}