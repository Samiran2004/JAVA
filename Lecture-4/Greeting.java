import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greet();
        System.out.println("Message: " + greeString());
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        input.close();
        System.out.println(greetMessage(name));
    }

    static void greet() {
        System.out.println("Hello World!");
    }

    static String greetMessage(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greeString() {
        String message = "Hello World 2!";
        return message;
    }
}