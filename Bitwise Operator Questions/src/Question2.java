// Find Unique Element //

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println(findUniqueElement(arr));
    }

    public static int findUniqueElement(int[] arr){
        int uniqElm = 0;
        for(int n:arr){
            uniqElm ^= n;
        }
        return uniqElm;
    }
}