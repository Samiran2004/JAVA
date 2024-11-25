import java.util.*;

class Leetcode1248 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.printf("Enter the %d number element of the array: ", i+1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = input.nextInt();
        input.close();
        System.out.println(numberOfSubarrays(arr, k));
    }

    private static int numberOfSubarrays(int[] nums, int k) {
        int result = 0, curr = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0, 1);
        for(int i: nums) {
            curr += i % 2;
            result += map.getOrDefault(curr - k, 0);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return result;
    }
}