package twoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row = input.nextInt();
        System.out.print("Enter the size of the column: ");
        int column = input.nextInt();
        int[][] arr = new int[row][column];
        for(int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                System.out.printf("Enter %d number row and %d number column element: ",i+1,j+1);
                arr[i][j] = input.nextInt();
            }
        }
        transpose(arr);
    }

    public static void transpose(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i<arr.length; i++){
            System.out.print("[ ");
            for (int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
