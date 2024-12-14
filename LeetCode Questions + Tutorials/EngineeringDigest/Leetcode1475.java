import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Leetcode1475 {
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
        System.out.println(Arrays.toString(finalPrices(arr)));
    }

    private static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] resArr = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                resArr[index] = prices[index] - prices[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            resArr[idx] = prices[idx];
        }

        return resArr;
    }
}
