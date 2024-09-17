package basics;

public class Abstruction {
    public static void main(String[] args) {
        BMW b1 = new BMW();
        b1.start();
    }
}

abstract class Car{
    int price;

    abstract void start();
}

class BMW extends Car{
    @Override
    void start() {
        System.out.println("BMW started...");
    }
}
class Volvo extends Car{
    @Override
    void start() {
        System.out.println("Volvo started...");
    }
}