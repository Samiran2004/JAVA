public class Recursion {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.print("Print N to One: ");
        printNtoOne(5);
        System.out.print("Print One to N: ");
        printOneToN(1, 5);
        System.out.print("Print One to N: ");
        printOneToN(5);
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Print n to 1...
    private static void printNtoOne(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printNtoOne(n - 1);
    }

    // Print 1 to n...
    private static void printOneToN(int idx, int n) {
        if (idx == n) {
            System.out.println(idx);
            return;
        }
        System.out.print(idx + " ");
        printOneToN(idx + 1, n);
    }

    // Print 1 to n without index...
    private static void printOneToN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printOneToN(n - 1);
        System.out.print(n + " ");
        // System.out.println();
    }
}
