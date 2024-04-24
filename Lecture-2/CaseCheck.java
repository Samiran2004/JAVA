import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a charecter: ");
        char ch = input.next().charAt(0);
        input.close();

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase charecter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase charecter.");
        } else {
            System.out.println(ch + " is not a charecter.");
        }
    }
}
