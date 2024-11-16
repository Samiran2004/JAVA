import java.util.Scanner;

public class Leetcode643 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element: ", i + 1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = input.nextInt();
        input.close();
        System.out.println(findMaxAverage(arr, k));
    }

    private static double findMaxAverage(int nums[], int k) {
        double ans = 0, window = 0;
        for (int i = 0; i < k; i++) {
            window += nums[i];
        }
        ans = window / k;
        for (int i = k; i < nums.length; i++) {
            window += nums[i] - nums[i - k];
            ans = Math.max(ans, window / k);
        }
        return ans;
    }
}
