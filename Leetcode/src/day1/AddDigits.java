package day1;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        System.out.print(addDigits(num));
    }

//    static int addDigits(int num){
//        while (num > 9){
//            int sum = 0;
//            String strNum = String.valueOf(num);
//            for(char c: strNum.toCharArray()){
//                sum += Character.getNumericValue(c);
//            }
//            num = sum;
//        }
//        return num;
//    }

    static int addDigits(int num){
        while (num / 10 != 0){
            int sum = 0;
            while (num > 0){
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            if(sum / 10 == 0){
                return sum;
            }else {
                num = sum;
            }
        }
        return num;
    }
}
