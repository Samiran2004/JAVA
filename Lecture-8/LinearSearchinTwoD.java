import java.util.Scanner;

public class LinearSearchinTwoD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int rowSize = input.nextInt();
        System.out.print("Enter the column size: ");
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
        System.out.println(linearSearch(arr, target));
    }

    static boolean linearSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
