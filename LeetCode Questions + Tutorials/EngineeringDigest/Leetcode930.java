import java.util.*;

class Leetcode930 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the goal value: ");
        int goal = input.nextInt();
        input.close();
        System.out.println(numSubarraysWithSum(arr, goal));
    }
    private static int numSubarraysWithSum(int[] nums, int goal) {
        int result = 0, prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i : nums) {
            prefixSum += i;
            result += map.getOrDefault(prefixSum - goal, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return result;
    }
}