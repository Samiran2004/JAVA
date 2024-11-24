import java.util.Scanner;

public class Leetcode383 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ransomenote string: ");
        String ransomenote = input.next();
        System.out.println("Enter magazine string: ");
        String magazine = input.next();
        input.close();
        System.out.println(canConstruct(ransomenote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        for (char r : ransomNote.toCharArray()) {
            arr[r - 'a']++;
        }
        for (char r : magazine.toCharArray()) {
            arr[r - 'a']--;
        }
        for (int i : arr) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
