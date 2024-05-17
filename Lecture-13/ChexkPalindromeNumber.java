import java.util.Scanner;

public class ChexkPalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int number = input.nextInt();
        input.close();
        System.out.println(checkPalindrome(number));
        System.out.println(checkPalindrome2(number));
    }

    static boolean checkPalindrome(int num) {
        String strNum = String.valueOf(num);
        StringBuilder builder = new StringBuilder();
        for (int i = strNum.length() - 1; i >= 0; i--) {
            builder.append(strNum.charAt(i));
        }
        return strNum.equals(builder.toString());
    }

    static boolean checkPalindrome2(int num) {
        if (num < 0) {
            return false;
        } else {
            int temp = num;
            int newNum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                newNum = newNum * 10 + rem;
                temp = temp / 10;
            }
            return num == newNum;
        }
    }
}
