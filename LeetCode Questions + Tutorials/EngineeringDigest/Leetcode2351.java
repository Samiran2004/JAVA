import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode2351 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        input.close();
        System.out.println(repeatedCharacter(str));
    }

    private static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i);
            } else {
                set.add(s.charAt(i));
            }
        }
        return s.charAt(0);
    }
}