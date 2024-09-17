import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(fib(num));
    }
    private static int fib(int num){
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }else{
            return fib(num -1) + fib(num - 2);
        }
    }
}