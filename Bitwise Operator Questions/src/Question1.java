/* Given a number and find if it is odd or even */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
        if((num & 1) == 0){
            System.out.printf("%d is a even number.",num);
        }else {
            System.out.printf("%d is a odd number.",num);
        }
    }
}
