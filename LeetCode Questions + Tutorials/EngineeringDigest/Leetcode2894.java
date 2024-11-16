/*
 * You are given positive integers n and m.

Define two integers as follows:

num1: The sum of all integers in the range [1, n] (both inclusive) that are not divisible by m.
num2: The sum of all integers in the range [1, n] (both inclusive) that are divisible by m.
Return the integer num1 - num2.

 

Example 1:

Input: n = 10, m = 3
Output: 19
Explanation: In the given example:
- Integers in the range [1, 10] that are not divisible by 3 are [1,2,4,5,7,8,10], num1 is the sum of those integers = 37.
- Integers in the range [1, 10] that are divisible by 3 are [3,6,9], num2 is the sum of those integers = 18.
We return 37 - 18 = 19 as the answer.
 */

// Link: https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/

import java.util.ArrayList;
import java.util.Scanner;

public class Leetcode2894 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of m: ");
        int m = input.nextInt();
        input.close();
        System.out.println("Divisible and Non-divisible Sums Difference: " + differenceOfSums(n, m));
    }

    private static int differenceOfSums(int n, int m) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int currNum = i + 1;
            if (currNum % m == 0) {
                arr2.add(currNum);
            } else if (currNum % m != 0) {
                arr1.add(currNum);
            }
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.size(); i++) {
            sum1 += arr1.get(i);
        }
        System.out.println(sum1);
        for (int i = 0; i < arr2.size(); i++) {
            sum2 += arr2.get(i);
        }
        System.out.println(sum2);
        return sum1 - sum2;
    }
}
