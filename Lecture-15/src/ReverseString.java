import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the string array: ");
        int size = input.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i<size; i++){
            System.out.printf("Enter %d number string: ",i+1);
            arr[i] = input.next();
        }
        input.close();
        System.out.println(Arrays.toString(arr));
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseString(String[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        while (start<end){
//            String temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }

        int end = arr.length - 1;
        for(int i = 0; i<arr.length/2; i++){
            String temp = arr[i];
            arr[i] = arr[end - i];
            arr[end - i] = temp;
        }
    }
}
