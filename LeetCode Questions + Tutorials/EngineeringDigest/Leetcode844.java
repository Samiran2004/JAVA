import java.util.Scanner;
import java.util.Stack;

public class Leetcode844 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String s = input.next();
        System.out.print("Enter 2nd string: ");
        String t = input.next();
        System.out.println(backspaceCompare(s, t));
        input.close();
    }

    private static boolean backspaceCompare(String s, String t) {
        char[] str1Arr = s.toCharArray();
        char[] str2Arr = t.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char c : str1Arr) {
            if (c == '#' && !stack1.empty() && stack1.peek() != '#') {
                stack1.pop();
            } else if (c != '#') {
                stack1.add(c);
            }
        }
        for (char c : str2Arr) {
            if (c == '#' && !stack2.empty() && stack2.peek() != '#') {
                stack2.pop();
            } else if (c != '#') {
                stack2.add(c);
            }
        }
        System.out.println("Stack 1 Size: " + stack1.size());
        System.out.println("Stack 2 Size: " + stack2.size());
        if (stack1.size() != stack2.size() || !stack1.equals(stack2)) {
            return false;
        }
        return true;
    }
}
