import java.util.Scanner;

class Leetcode917 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.next();
        input.close();
        System.out.println(reverseOnlyLetters(s));
    }

    private static String reverseOnlyLetters(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while (i < j) {
            while (i < j && !isEnglish(arr[i])) {
                i++;
            }
            while (i < j && !isEnglish(arr[j])) {
                j--;
            }
            swap(arr, i, j);
            i++;
            j--;
        }
        return new String(arr);
    }

    private static boolean isEnglish(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}