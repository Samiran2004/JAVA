import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.printf("Enter %d number element of the array: ", i+1);
            arr[i] = input.nextInt();
        }
        input.close();
        minimumNumberGame(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void minimumNumberGame(int[] arr){
//        Arrays.sort(arr);
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] >arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int i = 0;
        int j = i+1;
        while (i<=arr.length-2 && j<=arr.length-1){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j+=2;
        }
    }
}
