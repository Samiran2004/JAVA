package day5;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.next();

        System.out.println(reverseVowels(str));
    }

    public static String reverseVowels(String str ){
        char[] strArr = str.toCharArray();
        int i = 0, j = str.length()-1;
        while (i<j){
            while (i<j && checkIsVowel(strArr[i])){
                i++;
            }
            while (i<j && checkIsVowel(strArr[j])){
                j--;
            }
            if(i<j){
                char temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(strArr);
    }

    public static boolean checkIsVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
