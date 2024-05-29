import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = input.nextInt();
        input.close();
        System.out.println(searchPosition(arr, target));
    }

    //Brute Force Solution....
    static int searchPosition(int[] arr, int target) {
        int i = arr.length - 1;
        while (i >= 0) {
            if (arr[i] == target) {
                return i;
            } else if (arr[i] < target) {
                return i + 1;
            }
            i--;
        }
        return 0;
    }

    //Main Solution using Binary Search....
    static int searchPositionBinarySearch(int[] arr, int target){
        return 0;
    }
}