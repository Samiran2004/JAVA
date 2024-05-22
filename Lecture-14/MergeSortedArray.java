import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.printf("Enter %d number element of the first array: ", i + 1);
            arr1[i] = input.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.printf("Enter %d number element of the second array: ", i + 1);
            arr2[i] = input.nextInt();
        }
        System.out.print("Enter value1: ");
        int val1 = input.nextInt();
        System.out.print("Enter value2: ");
        int val2 = input.nextInt();
        input.close();
        mergeArray(arr1, val1, arr2, val2);
        System.out.println(Arrays.toString(arr1));
    }

    // static int[] mergeArray(int[] arr1, int val1, int[] arr2, int val2) {
    // int[] newArr = new int[val1 + val2];
    // int index = 0;
    // for (int i = 0; i < val1; i++) {
    // newArr[index] = arr1[i];
    // index++;
    // }
    // for (int i = 0; i < val2; i++) {
    // newArr[index] = arr2[i];
    // index++;
    // }
    // Arrays.sort(newArr);
    // return newArr;
    // }

    static void mergeArray(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            arr1[k] = arr2[j];
            k--;
            j--;
        }
    }
}
