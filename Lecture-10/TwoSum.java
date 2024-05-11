import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of the array: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = input.nextInt();
        input.close();
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
