package day5;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        input.close();

        System.out.println("Array before moving zeroes: "+ Arrays.toString(arr));
        moveZero(arr);
        System.out.println("Array after moving zeroes: "+Arrays.toString(arr));
    }

    public static void moveZero(int[] arr){
//        for (int i = 0; i<arr.length-1; i++){
//            int j = i, k = j+1;
//            if(arr[j] == 0){
//                while (j!=arr.length-1 && k != arr.length){
//                    int temp = arr[j];
//                    arr[j] = arr[k];
//                    arr[k] = temp;
//                    j++;
//                    k++;
//                }
//            }
//        }

        int lastNonZerorIdx = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[lastNonZerorIdx] = arr[i];
                lastNonZerorIdx++;
            }
        }
        for(int i = lastNonZerorIdx; i<arr.length; i++){
            arr[i] = 0;
        }
    }
}
