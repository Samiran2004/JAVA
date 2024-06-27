import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
//        funOneToN(num);
        funcBoth(num);
    }

    public static void funOneToN(int n){
        if(n == 0){
            return;
        }
        funOneToN(n-1);
        System.out.print(" "+n);
    }

    public static void funcBoth(int n){
        if(n == 0){
            return;
        }
        System.out.print(" "+n);
        funcBoth(n-1);
        System.out.print(" "+n);
    }
}
