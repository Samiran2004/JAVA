import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st binary number: ");
        String num1 = input.next();
        System.out.print("Enter 2nd binary number: ");
        String num2 = input.next();
        input.close();
        System.out.println(addBinary(num1,num2));
    }

    public static String addBinary(String num1, String num2){
        StringBuilder result = new StringBuilder();

        return result.toString();
    }
}
