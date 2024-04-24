import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fruit name: ");
        String fruit = input.next();
        input.close();

        switch (fruit) {
            case "mango":
                System.out.println("King of fruits.");
                break;
            case "apple":
                System.out.println("A sweet red fruit,");
                break;
            case "orange":
                System.out.println("Round fruit.");
                break;
            case "grapes":
                System.out.println("Small fruit.");
                break;
            default:
                break;
        }
    }
}