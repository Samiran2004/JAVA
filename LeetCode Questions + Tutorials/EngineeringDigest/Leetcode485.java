import java.util.Scanner;

public class Leetcode485 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    // private static int findMaxConsecutiveOnes(int[] nums) {
    // int left = 0, sum = 0, ans = -1;
    // for (int right = 0; right < nums.length; right++) {
    // sum += nums[right];
    // while (right - left + 1 != sum) {
    // sum -= nums[left];
    // left++;
    // }
    // ans = Math.max(ans, sum);
    // }
    // return ans;
    // }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxCount = Math.max(count, maxCount);
                count = 0;
            } else {
                count++;
            }
        }
        return Math.max(count, maxCount);
    }
}