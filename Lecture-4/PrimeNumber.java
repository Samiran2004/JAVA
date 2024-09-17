import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            int c = 2;
            while (c * c <= num) {
                if (num % c == 0) {
                    return false;
                }
                c++;
            }
            return true;
        }
    }
}
