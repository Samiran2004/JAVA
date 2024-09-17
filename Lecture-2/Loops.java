import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        // For Loop...
        // for (int i = 0; i < number; i++) {
        // System.out.println(i + 1);
        // }

        // While Loop...
        // int num = 0;
        // while (num < number) {
        // System.out.println(num+1);
        // num++;
        // }

        // Do While Loop...
        int num = 0;
        do {
            System.out.println(num + 1);
            num++;
        } while (num < number);
    }
}