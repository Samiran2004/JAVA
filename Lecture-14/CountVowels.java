import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = input.next();
        input.close();
        System.out.println(countVowel(word));
    }

    static int countVowel(String word) {
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
