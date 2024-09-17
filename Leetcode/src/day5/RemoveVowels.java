package day5;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        System.out.println(removeVowels(str));
    }

    public static String removeVowels(String str){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char curChar = str.charAt(i);
            if(curChar == 'a' || curChar == 'e' || curChar == 'i' || curChar == 'o' || curChar == 'u'){
                continue;
            }
            builder.append(curChar);
        }
        return builder.toString();
    }
}
