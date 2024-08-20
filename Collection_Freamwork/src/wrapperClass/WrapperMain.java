package wrapperClass;

public class WrapperMain {
    public static void main(String[] args) {
        Integer obj1 = Integer.valueOf(10);

        //This is called autoboxing...
        Integer obj2 = 34;

        //This is called unboxing...
        int age = obj2;
        System.out.println(age);
    }
}
