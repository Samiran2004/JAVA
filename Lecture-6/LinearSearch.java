import java.util.Scanner;

public class LinearSearch {

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
        int result = linear(arr, key);
        System.out.println(result);
    }

    static int linear(int[] arr, int key) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }

}