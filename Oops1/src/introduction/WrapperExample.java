package introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        A guddu = new A("Samiran Samanta");

    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
    }
}