import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
}
