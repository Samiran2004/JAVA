import java.util.Scanner;

public class Leetcode1456 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        System.out.print("Enter the length: ");
        int length = input.nextInt();
        input.close();
        System.out.println(maxVowels(str, length));
    }

    private static int maxVowels(String s, int k) {
        int left = 0, right = 0, res = 0, window = 0;
        for (; right < k; right++) {
            if (isVowel(s.charAt(right))) {
                window += 1;
            }
        }
        while (right < s.length()) {
            if (isVowel(s.charAt(left++))) {
                window -= 1;
            }
            if (isVowel(s.charAt(right++))) {
                window += 1;
            }
            res = Math.max(res, window);
        }
        return res;
    }

    private static boolean isVowel(char c) {
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
    }
}
