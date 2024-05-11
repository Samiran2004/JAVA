import java.util.Arrays;
import java.util.Scanner;

public class AllSortingAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of the array: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter 1 for bubble sort, 2 for selection sort, 3 for insertion sort: ");
        int choice = input.nextInt();
        input.close();
        switch (choice) {
            case 1:
                System.out.println("Bubble sort...");
                bubbleSort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            case 2:
                System.out.println("Selection sort...");
                selectionSortAlgorithm(arr);
                System.out.println(Arrays.toString(arr));
                break;
            case 3:
                System.out.println("Insertion sort...");
                insertionSortAlgorithm(arr);
                System.out.println(Arrays.toString(arr));
                break;
            default:
                System.out.println("Enter a valid option...");
                break;
        }
    }

    static void bubbleSort(int[] arr) {
        boolean isSwap = false;
        for (int i = 0; i < arr.length - 1; i++) {
            isSwap = false;
            for (int j = 0; j < arr.length - 1; j++) {
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

    static void selectionSortAlgorithm(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    static void insertionSortAlgorithm(int[] arr) {
        int key;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
