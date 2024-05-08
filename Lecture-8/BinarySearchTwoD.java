import java.util.Scanner;

public class BinarySearchTwoD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int rowSize = input.nextInt();
        System.out.print("Enter the size of the column: ");
        int columnSize = input.nextInt();
        int[][] arr = new int[rowSize][columnSize];
        System.out.println("Enter all elements in sorted order...");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print("Enter the element of the array: ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        input.close();
        System.out.println(binarySearch(arr, target));
    }

    static boolean binarySearch(int[][] arr, int target) {
        int row = 0, column = arr[0].length - 1;
        while (row < arr.length && column >= 0) {
            if (arr[row][column] == target) {
                return true;
            } else if (arr[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
