import java.util.*;

public class PowerOfFour{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(isPowerOfFour(num));
    }
    private static boolean isPowerOfFour(int num){
        if(num == 1) return true;
        while(num > 5){
            if(num % 4 != 0) return false;
            num /= 4;
        }
        return num == 4;
    }
}