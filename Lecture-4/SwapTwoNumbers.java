import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int secondNum = input.nextInt();
        input.close();
        swap(firstNum, secondNum);
        swap2(firstNum, secondNum);
    }

    static void swap(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("1st number after swap: " + num1);
        System.out.println("2nd number after swap: " + num2);
    }

    static void swap2(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("1st number after swap: " + a);
        System.out.println("2nd number after swap: " + b);
    }
}
