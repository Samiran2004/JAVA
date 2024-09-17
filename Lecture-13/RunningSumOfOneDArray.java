import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOfOneDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %s number element: ", i + 1);
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println(Arrays.toString(runningSum(arr)));
        System.out.println(Arrays.toString(runningSum2(arr)));
    }

    static int[] runningSum(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            newArr[i] = sum;
        }
        return newArr;
    }

    static int[] runningSum2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
}