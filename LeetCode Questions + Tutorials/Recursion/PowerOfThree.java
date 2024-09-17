import java.util.*;

public class PowerOfThree{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(isPowerOfThree(num));
    }
    private static boolean isPowerOfThree(int num){
        if(num == 1) return true;
        while(num > 4){
            if(num % 3 != 0) return false;
            num /= 3;
        }
        return num == 3;
    }
}