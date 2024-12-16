import java.util.HashMap;
import java.util.Scanner;

public class Leetcode219 {
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
        System.out.println(containsNearbyDuplicate(arr, k));
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i : nums) {
            if (map.containsKey(i) && (index - map.get(i)) <= k) {
                return true;
            } else {
                map.put(i, index);
            }
            index++;
        }
        return false;
    }
}
