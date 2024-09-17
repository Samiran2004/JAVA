import java.util.Arrays;
import java.util.Scanner;

public class SqrSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    static int[] sortedSquares(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * arr[i];
        }
        Arrays.sort(newArr);
        return newArr;
    }
}
