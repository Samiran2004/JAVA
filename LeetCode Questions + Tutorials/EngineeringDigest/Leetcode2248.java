import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Leetcode2248 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int row = input.nextInt();
        System.out.print("Enter the column number: ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element of row: " + (i + 1) + " column: " + (j + 1) + ": ");
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        System.out.println(intersection(arr));
    }

    private static List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : nums) {
            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}