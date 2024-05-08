import java.util.Scanner;

public class CheckSortedAndRoatedArray {
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
        System.out.println(checkSortedAndRotated(arr));
    }

    static boolean checkSortedAndRotated(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
