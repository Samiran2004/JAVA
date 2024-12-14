import java.util.HashMap;
import java.util.Scanner;

public class Leetcode2006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = input.nextInt();
        input.close();
        System.out.println(countKDifference(arr, k));
    }

    private static int countKDifference(int[] nums, int k) {
        // int count = 0;
        // for (int i = 0; i < nums.length - 1; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] - nums[j] == k || nums[j] - nums[i] == k) {
        // count++;
        // }
        // }
        // }
        // return count;

        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            result += map.getOrDefault(nums[i] - k, 0);
            result += map.getOrDefault(nums[i] + k, 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return result;
    }
}
