package day5;

import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String w1 = input.next();
        System.out.print("Enter second string: ");
        String w2 = input.next();
        System.out.println(mergeAlternately(w1,w2));
    }

    public static String mergeAlternately(String w1, String w2){
        StringBuilder builder = new StringBuilder();
        int w1Len = w1.length(), w2Len = w2.length(), count1 = 0, count2 = 0;

        while(count1 < w1Len && count2 < w2Len) {
            builder.append(w1.charAt(count1));
            builder.append((w2.charAt(count2)));
            count1++;
            count2++;
        }
        while (count1<w1Len){
            builder.append(w1.charAt(count1));
            count1++;
        }
        while (count2<w2Len){
            builder.append(w2.charAt(count2));
            count2++;
        }
        return builder.toString();
    }
}
