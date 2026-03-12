package MODULE_7;
import java.util.Arrays;

public class RotatedSortedSearch {

    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            }

            // Left half is sorted
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1; // search left
                } else {
                    left = mid + 1; // search right
                }
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1; // search right
                } else {
                    right = mid - 1; // search left
                }
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int target = 2;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);

        int index = search(arr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}