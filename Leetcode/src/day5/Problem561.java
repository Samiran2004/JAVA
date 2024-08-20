package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Problem561 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        System.out.println(arrayPairSum(arr));
    }

    public static int arrayPairSum(int[] arr){
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i<arr.length-1; i+=2){
            sum += arr[i];
        }
        return sum;
    }
}
