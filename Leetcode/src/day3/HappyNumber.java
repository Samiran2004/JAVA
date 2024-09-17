package day3;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input number: ");
        int num = input.nextInt();
        System.out.println("The number is happy: "+isHappy(num));
    }

    public static boolean isHappy(int num){
        String strNum = String.valueOf(num);
        if(strNum.length() == 1){
            return false;
        }
        int length = strNum.length();
        boolean ans = false;
        while (length != 1){
            int sum = 0;
            for(int i = 0; i<strNum.toCharArray().length; i++){
                sum = Character.getNumericValue(strNum.toCharArray()[i] * strNum.toCharArray()[i]);
                length = String.valueOf(sum).length();
            }
            if(sum == 1){
                ans = true;
            }
        }
        return ans;
    }
}
