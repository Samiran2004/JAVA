package day4;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Duplicate number is: "+findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr){
//        int ans = 0;
//        Arrays.sort(arr);
//        for (int i = 0; i<arr.length -1; i++){
//            if(arr[i] == arr[i+1]) {
//                    ans = arr[i];
//            }
//        }
//        return ans;

        //Another way.....
        boolean[] arrs = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(arrs[arr[i]]){
                return arr[i];
            }
            arrs[arr[i]] = true;
        }
        return -1;
    }
}
