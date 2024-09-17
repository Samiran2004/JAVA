import java.util.Scanner;

public class FibonacchiNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int position = input.nextInt();
        input.close();

        int a = 0, b = 1, c;
        if (position == 1) {
            System.out.println("Fibonacci number at position " + position + " is:" + a);
        } else if (position == 2) {
            System.out.println("Fibonacchi number at position " + position + " is:" + b);
        } else {
            for (int i = 3; i <= position; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Fibonacchi number at position " + position + " is: " + b);
        }
    }
}
