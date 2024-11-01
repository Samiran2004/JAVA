import java.util.*;

class Leetcode977 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element of the array: ", i + 1);
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    private static int[] sortedSquares(int[] nums) {
        int start = 0, end = nums.length - 1;
        int[] newArr = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                newArr[i] = (int) Math.pow(nums[start], 2);
                start++;
            } else {
                newArr[i] = (int) Math.pow(nums[end], 2);
                end--;
            }
        }
        return newArr;
    }
}