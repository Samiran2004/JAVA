package generics;

public class GenericMethod {
    public static void main(String[] args) {
        printData("721154Sam200430");
        printId(721154);
        printId("Sam2004");

        GenericMethod obj = new GenericMethod();
        obj.<Integer>doubleData(78);
    }

    static void printData(String data){
        System.out.println(data);
    }

    static <E> void printId(E data){
        System.out.println(data);
    }
    <E> void doubleData(E data){
        System.out.println(data);
    }
}