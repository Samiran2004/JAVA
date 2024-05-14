import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name = "   Samiran Samanta   ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('m'));
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.length());
    }
}