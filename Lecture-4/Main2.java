import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Q: Take input of two numbers and print the sum...
        sum();
        int result = multiplication();
        System.out.println("Multiplication result: " + result);
    }

    static int multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        int result = num1 * num2;
        return result;
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Result: " + sum);
    }
}