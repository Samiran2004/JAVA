import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Before: "+ Arrays.toString(arr));
        reverseArr(arr);
        System.out.println("After: "+Arrays.toString(arr));
    }
    public static void reverseArr(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i != j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}