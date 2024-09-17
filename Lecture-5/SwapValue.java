import java.util.Arrays;
import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Before swap: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        swap(arr, 2, 4);

        System.out.println("After swap: ");
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int firstIndex, int lastIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}
