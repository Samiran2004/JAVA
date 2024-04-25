public class MethodOverLoading {
    public static void main(String[] args) {
        function(20);
        function("Samiran");
    }

    static void function(int num) {
        System.out.println(num);
    }

    static void function(String name) {
        System.out.println(name);
    }
}
