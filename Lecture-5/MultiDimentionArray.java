import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String[] args) {
        // int[][] arr = new int[3][];
        // int[][] arr = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };

        // input....
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int rowSize = input.nextInt();
        System.out.print("Enter the size of the column: ");
        int columnSize = input.nextInt();
        int[][] arr = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.println("Enter the element: ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The array: ");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
