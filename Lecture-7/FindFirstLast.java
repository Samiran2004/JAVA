import java.util.Scanner;

public class FindFirstLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target element: ");
        int key = input.nextInt();
        input.close();
        findFirstLastPosition(arr, key);
    }

    static int[] findFirstLastPosition(int[] arr, int key) {
        int[] ans = { -1, -1 };
        int start = binarySearch(arr, key, true);
        int end = binarySearch(arr, key, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int binarySearch(int[] arr, int key, boolean isLeft) {
        int start = 0;
        int end = arr.length;
        int res = -1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (key >= arr[mid]) {
                start = mid + 1;
            } else if (key <= arr[mid]) {
                end = mid + 1;
            } else {
                res = mid;
                if (isLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return res;
    }
}