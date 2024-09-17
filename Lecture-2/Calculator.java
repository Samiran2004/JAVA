import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int ans = 0;
            System.out.print("Enter the operator: ");
            char operator = input.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter 1st number: ");
                int num1 = input.nextInt();
                System.out.print("Enter 2nd number: ");
                int num2 = input.nextInt();
                if (operator == '+') {
                    ans = num1 + num2;
                } else if (operator == '-') {
                    ans = num1 - num2;
                } else if (operator == '*') {
                    ans = num1 * num2;
                } else if (operator == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else {
                    ans = num1 % num2;
                }
                System.out.println("Result: " + ans);
            } else if (operator == 'x' || operator == 'X') {
                input.close();
                break;
            } else {
                System.out.println("Please, enter a valid operator...");
            }
        }
    }
}
