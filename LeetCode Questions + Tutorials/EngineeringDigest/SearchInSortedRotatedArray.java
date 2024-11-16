import java.util.Scanner;

public class SearchInSortedRotatedArray {
    /*
     * Given a sorted and rotated array A of N distinct elements which is rotated at
     * some point,
     * and given an element key, The task is to find the index of the given element
     * key in the array A.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the search element: ");
        int key = input.nextInt();
        input.close();
        System.out.println(search(arr, 0, arr.length - 1, key));
    }

    private static int search(int[] arr, int l, int r, int key) {
        int pivot = getPivot(arr, l, r);
        int result = binarySearch(arr, l, pivot, key);
        if (result == -1) {
            result = binarySearch(arr, pivot + 1, r, key);
        }
        return result;
    }

    private static int binarySearch(int[] arr, int start, int end, int key) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int getPivot(int[] arr, int l, int r) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] > arr[l]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
