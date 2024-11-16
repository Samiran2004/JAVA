import java.util.*;

public class Leetcode167 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = input.nextInt();
        input.close();
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    // A brute force solution
    private static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            if (numbers[start] + numbers[end] == target) {
                return new int[] { start + 1, end + 1 };
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return null;
    }
}
