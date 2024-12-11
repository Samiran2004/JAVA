import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Leetcode169 {
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
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] nums) {
        // // ! 1st type...
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i : nums) {
        // map.put(i, map.getOrDefault(i, 0) + 1);
        // }
        // for (int i : map.keySet()) {
        // if (map.get(i) > nums.length / 2) {
        // return i;
        // }
        // }
        // return -2;

        // * Boyer Moore Majority Voting Algorithm */
        int candidate = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (candidate != curr && count == 0) {
                candidate = curr;
                count++;
            } else if (curr != candidate && count != 0) {
                count--;
            } else {
                count++;
            }
        }
        return candidate;
    }
}