import java.util.*;

class Leetcode209 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.printf("Enter the %d number element: ", i+1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = input.nextInt();
        input.close();
        System.out.println(minSubArrayLen(target, arr));
    }
    private static int minSubArrayLen(int target, int[] nums) {
        int left = 0, window = 0, ans = nums.length + 1;
        for(int right = 0; right < nums.length; right++){
            window += nums[right];
            while(window >= target){
                ans = Math.min(ans, right - left + 1);
                window -= nums[left++];

            }
        }
        return ans == nums.length + 1 ? 0 : ans;
    }
}