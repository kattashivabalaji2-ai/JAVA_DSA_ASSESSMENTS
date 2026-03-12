package MODULE_7;
import java.util.Arrays;

public class QuickSortExample {

    // Partition function (Lomuto scheme)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot to its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // pivot index

            quickSort(arr, low, pi - 1);  // sort left subarray
            quickSort(arr, pi + 1, high); // sort right subarray
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Original Array:" + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}