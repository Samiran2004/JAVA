import java.util.*;

class Leetcode1748 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element of the arry: ", i+1);
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println(sumOfUnique(arr));
    }
    private static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int sum = 0;
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}