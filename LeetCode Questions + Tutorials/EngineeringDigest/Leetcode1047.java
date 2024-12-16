import java.util.Scanner;
import java.util.Stack;

public class Leetcode1047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        input.close();
        System.out.println(removeDuplicates(str));
    }

    private static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character w : stack) {
            result.append(w);
        }
        return result.toString();
    }
}