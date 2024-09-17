import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of the array: ");
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println("Array before sorting...");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array after sorting...");
        System.out.println(Arrays.toString(arr));
    }

    // static void bubbleSort(int[] arr) {
    // boolean swap = false;
    // for (int i = 0; i < arr.length - 1; i++) {
    // swap = false;
    // for (int j = 0; j < arr.length - i - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // swap = true;
    // }
    // }
    // if (!swap) {
    // break;
    // }
    // }
    // }

    static void bubbleSort(int[] arr) {
        boolean isSwap = false;
        for (int i = 0; i < arr.length-1; i++) {
            isSwap = false;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }
}
