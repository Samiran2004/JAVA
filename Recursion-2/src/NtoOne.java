import java.util.Scanner;

public class NtoOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
        funcNtoOne(num);
    }

    public static void funcNtoOne(int n){
        if(n == 1){
            System.out.print(" "+n);
            return;
        }
        System.out.print(" "+n);
        funcNtoOne(n-1);
    }
}
