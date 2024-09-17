import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = input.nextInt();
        input.close();
        if (amstrong(num)) {
            System.out.println(num + " is an amstrong number.");
        } else {
            System.out.println(num + " is not an amstrong number.");
        }
    }

    static boolean amstrong(int num) {
        int sum = 0;
        int newNum = num;
        while (newNum != 0) {
            int rem = newNum % 10;
            sum += rem * rem * rem;
            newNum = newNum / 10;
        }

        if (num == sum) {
            return true;
        } else {
            return false;
        }
    }
}
