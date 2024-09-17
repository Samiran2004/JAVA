import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
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
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 9) {
                arr[i] = 0;
            } else {
                arr[i]++;
                return arr;
            }
        }
        int[] newArr = new int[arr.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}