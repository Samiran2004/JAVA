import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        // int[] arr = new int[size];
        // // arr[0] = 1;
        // // arr[1] = 2;
        // // System.out.println(Arrays.toString(arr));
        // for (int i = 0; i < size; i++) {
        // System.out.print("Enter number: ");
        // arr[i] = input.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // input.close();

        // Array of object....
        String[] str = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a string: ");
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

    }
}