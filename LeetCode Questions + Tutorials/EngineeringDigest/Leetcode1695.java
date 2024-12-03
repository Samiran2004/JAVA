import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode1695 {
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
        System.out.println(maximumUniqueSubarray(arr));
    }

    private static int maximumUniqueSubarray(int[] nums) {
        int res = 0, left = 0, sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            sum += nums[right];
            set.add(nums[right]);
            res = Math.max(res, sum);
        }
        return res;
    }
}