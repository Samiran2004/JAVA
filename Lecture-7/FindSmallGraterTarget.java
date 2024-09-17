import java.util.Arrays;
import java.util.Scanner;

public class FindSmallGraterTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        char[] character = new char[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the elements: ");
            character[i] = input.next().charAt(0);
        }

        System.out.print("Enter the target element: ");
        char key = input.next().charAt(0);
        input.close();
        System.out.println(findSGTarget(character, key));
    }

    static char findSGTarget(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (target >= arr[mid]) {
                start = mid + 1;
            } else if (target <= arr[mid]) {
                end = mid - 1;
            }
        }
        return (arr[start % arr.length]);
    }
}
