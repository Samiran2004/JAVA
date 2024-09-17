import java.util.*;

public class PowerOfTwo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(isPowerOfTwo(num));
    }
    private static boolean isPowerOfTwo(int num){
        if(num == 1) return true;
        while(num > 3){
            if(num % 2 != 0) return false;
            num /= 2;
        }
        return num == 2;
    }
}