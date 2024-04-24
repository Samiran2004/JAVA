import java.util.Scanner;

public class DisplayDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int day = input.nextInt();
        input.close();
        if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5 || day == 7) {
            switch (day) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid day number");
        }
    }
}