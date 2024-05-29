import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of the array: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the key element: ");
        int key = input.nextInt();
        input.close();
        System.out.println(binarySearch(arr, key));
    }

    static boolean binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (arr[mid] == key) {
                return true;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}