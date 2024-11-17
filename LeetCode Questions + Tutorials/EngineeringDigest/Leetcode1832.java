import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode1832 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        input.close();
        System.out.println(checkIfPangram(str));
    }

    private static boolean checkIfPangram(String sentence) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            charSet.add(sentence.charAt(i));
        }
        for (int i = 97; i <= 122; i++) {
            char currChar = (char) i;
            if (!charSet.contains(currChar)) {
                return false;
            }
        }
        return true;
    }
}
