import java.util.Scanner;
import java.util.Stack;

public class Leetcode1544 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        input.close();
        System.out.println(makeGood(s));
    }

    private static String makeGood(String s) {
        // ! Create a stack for string operations...
        Stack<Character> stack = new Stack<>();
        // * iterate every character */
        for (char c : s.toCharArray()) {
            // ! Check 1: Ensure the stack is not empty before proceeding.
            // ! Check 2: Evaluate the following conditions:
            //* a) The top value of the stack is lowercase, and the current character is
            //* uppercase,
            //* and both characters are the same when compared case-insensitively.
            //* OR
            //* b) The top value of the stack is uppercase, and the current character is
            //* lowercase,
            //* and both characters are the same when compared case-insensitively.

            if (!stack.isEmpty() &&
                    ((Character.isLowerCase(stack.peek()) && Character.isUpperCase(c)
                            && stack.peek() == Character.toLowerCase(c)) ||
                            (Character.isUpperCase(stack.peek()) && Character.isLowerCase(c)
                                    && stack.peek() == Character.toUpperCase(c)))) {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}