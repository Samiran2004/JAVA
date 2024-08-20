package day3;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }

        System.out.println(findSingleNum(arr));
    }

    public static int findSingleNum(int[] arr){
        Arrays.sort(arr);
        int ans = -1;
        for(int i = 0; i<arr.length-2; i++){
            for(int j = i+1; j<arr.length-1; j++){
                if(arr[i] != arr[j]){
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
}
