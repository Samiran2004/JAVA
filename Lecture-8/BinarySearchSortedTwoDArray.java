import java.util.Scanner;

public class BinarySearchSortedTwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the row: ");
        int rowSize = input.nextInt();
        System.out.print("Enter size of the column: ");
        int columnSize = input.nextInt();
        int[][] arr = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print("Enter the element of the array: ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        input.close();
        System.out.println(binarySearchSorted(arr, target));
    }

    static boolean binarySearchSorted(int[][] arr, int target) {
        int column = arr[0].length, start = 0, end = (arr.length * column) - 1;
        while (start < end) {
            int mid = (start + (end - start) / 2);
            int midValue = arr[mid / column][mid % column];
            if (target == midValue) {
                return true;
            } else if (target > midValue) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
