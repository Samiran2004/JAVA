import java.util.*;

public class Leetcode2824 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        input.close();
        System.out.println(countPairs(arr, target));
    }

    // private static int countPairs(int[] arr, int target) {
    // Arrays.sort(arr);
    // int res = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] + arr[j] < target) {
    // res++;
    // } else {
    // break;
    // }
    // }
    // }
    // return res;
    // }

    private static int countPairs(int[] arr, int target) {
        Arrays.sort(arr);
        int result = 0;
        int leftPtr = 0;
        int rightPtr = arr.length - 1;
        while (leftPtr != rightPtr) {
            if (arr[leftPtr] + arr[rightPtr] < target) {
                result += rightPtr - leftPtr;
                leftPtr++;
            } else {
                rightPtr--;
            }
        }
        return result;
    }
}
