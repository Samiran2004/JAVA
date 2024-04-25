public class Shadowing {
    static int x = 100;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 50;
        System.out.println(x);
        func();
    }

    static void func() {
        System.out.println(x);
    }
}
