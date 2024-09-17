import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the starting index: ");
        int start = input.nextInt();
        System.out.print("Enter the ending index: ");
        int end = input.nextInt();
        System.out.print("Enter the key element: ");
        int key = input.nextInt();
        input.close();
        int result = search(arr, start, end, key);
        System.out.println((result == -1) ? "Element not found..." : "Element found on: " + result + " index");
    }

    static int search(int[] arr, int start, int end, int key) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
