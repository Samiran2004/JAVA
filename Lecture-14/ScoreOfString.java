import java.util.Scanner;

public class ScoreOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str = input.nextLine();
        input.close();
        System.out.println(scoreOfString(str));
    }

    static int scoreOfString(String str) {
        int score = 0;
        for (int i = 1; i < str.length(); i++) {
            score += Math.abs(str.charAt(i) - str.charAt(i - 1));
        }
        return score;
    }
}