import java.util.Arrays;
import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            System.out.printf("Enter %d number element of the array: ", i+1);
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println(Arrays.toString(concat(arr)));
    }

    public static int[] concat(int[] arr){
        int[] newArr = new int[arr.length * 2];
        for(int i = 0; i<arr.length; i++){
            newArr[i] = arr[i];
            newArr[i + arr.length] = arr[i];
        }
        return newArr;
    }
}