import java.util.Arrays;
import java.util.Scanner;

public class SearchTwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int rowSize = input.nextInt();
        System.out.print("Enter the column size: ");
        int columnSize = input.nextInt();
        int[][] arr = new int[rowSize][columnSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print("Enter the " + i + " row and " + j + " number column element: ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter the key element: ");
        int key = input.nextInt();
        input.close();
        int[] result = search(arr, key);
        System.out.println(Arrays.toString(result));
    }

    static int[] search(int[][] arr, int key) {
        int[] resultArr = { 0 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    return new int[] { i, j };
                }
            }
        }
        return resultArr;
    }
}