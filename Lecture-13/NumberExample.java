public class NumberExample {
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(n+1);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(n+1);
    }

    static void print3(int n) {
        System.out.println(n);
    }
}