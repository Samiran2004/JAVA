import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Leetcode496 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int size1 = input.nextInt();
        int[] nums1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            nums1[i] = input.nextInt();
        }

        System.out.print("Enter the size of 2nd array: ");
        int size2 = input.nextInt();
        int[] nums2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            nums2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        input.close();
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int currElm = nums2[i];
            while (!stack.isEmpty() && stack.peek() <= currElm) {
                stack.pop();
            }
            map.put(currElm, stack.isEmpty() ? -1 : stack.peek());
            stack.add(currElm);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}