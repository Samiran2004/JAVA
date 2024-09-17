import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        input.close();

        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            number /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
