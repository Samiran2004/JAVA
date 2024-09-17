import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = input.nextLong();
        System.out.print("Enter the occurrence number: ");
        int num = input.nextInt();
        input.close();

        int count = 0;
        while (number != 0) {
            if (number % 10 == num) {
                count++;
            }
            number = number / 10;
        }
        System.out.println("The number occurrence is: " + count);
    }
}
