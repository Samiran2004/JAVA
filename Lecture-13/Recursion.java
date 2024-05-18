public class Recursion {
    public static void main(String[] args) {
        // Number Recursion...
        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}