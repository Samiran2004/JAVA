import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.print("Enter 1 for print 1st pattern, 2 for 2nd, 3 for 3rd, 4 for 4th, 5 for 5th: ");
        int choice = input.nextInt();
        input.close();
        switch (choice) {
            case 1:
                pattern1(n);
                break;
            case 2:
                pattern2(n);
                break;
            case 3:
                pattern3(n);
                break;
            case 4:
                pattern4(n);
                break;
            case 5:
                pattern5(n);
                break;
            default:
                System.out.println("Please enter a valid choice...");
                break;
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = n; column >= row; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = n; column >= row; column--) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n * 2; row++) {
            if (row <= n) {
                for (int column = 1; column <= row; column++) {
                    System.out.print("* ");
                }
            } else {
                for (int column = n * 2 - row; column >= 1; column--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}