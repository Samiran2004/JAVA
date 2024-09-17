import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter a value: ");
        int val = input.nextInt();
        input.close();
        System.out.println(removeElement(arr, val));
    }

    static int removeElement(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}