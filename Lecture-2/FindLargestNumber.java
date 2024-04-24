import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        input.close();

        if (num1 > num2 && num1 > num3) {
        System.out.println("First number is largest.");
        } else if (num2 > num1 && num2 > num3) {
        System.out.println("Second number is largest.");
        } else if (num1 == num2 && num2 == num3) {
        System.out.println("All numbers are equal.");
        } else {
        System.out.println("Third number is largest.");
        }

        // int max = Math.max(num1, Math.max(num2, num3));
        // System.out.println("Maximum number: " + max);
    }
}
