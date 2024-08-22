import java.util.Scanner;

public class FindTheArraySorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            System.out.printf("Enter %d number element: ",i+1);
            arr[i] = input.nextInt();
        }
        System.out.println("The array is sorted: "+isSorted(arr));
        System.out.println("The array is sorted: "+sorted(arr,arr[0]));
    }

    private static boolean isSorted(int[] arr){
        int i = 0;
        while (i < arr.length-1){
            if (arr[i] > arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean sorted(int[] arr, int idx) {
        // Base condition
        if (idx == arr.length - 1) {
            return true;
        }
        return arr[idx] < arr[idx + 1] && sorted(arr, idx + 1);
    }

}
