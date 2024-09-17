import java.util.Arrays;

public class VariableArgument {
    public static void main(String[] args) {
        func(2, 3, 4, 5, 6, 7, 8, 5, 4, 3, 2);
        multipleArg(2, 3, "Samiran", "Raju", "Guddu", "Kiddo");
    }

    static void func(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multipleArg(int a, int b, String... v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
