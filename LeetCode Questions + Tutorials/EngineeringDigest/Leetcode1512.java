import java.util.*;

class Leetcode1512 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.printf("Enter %d number element: ", i+1);
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println(numIdenticalPairs(arr));
    }
    private static int numIdenticalPairs(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sum += (entry.getValue() * (entry.getValue() - 1)) / 2;
        }
        return sum;
    }
}