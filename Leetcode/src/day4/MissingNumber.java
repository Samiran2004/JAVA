package day4;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the element of the array: ");
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr){
        int[] newArr = new int[arr.length+1];
        Arrays.fill(newArr,-1);
        for (int j : arr) {
            newArr[j] = j;
        }
        for(int i = 0; i<newArr.length; i++){
            if(newArr[i] == -1){
                return i;
            }
        }
        return -1;
    }
}
