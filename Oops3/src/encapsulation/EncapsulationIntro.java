package encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {
    Laptop l1 = new Laptop();
    l1.setPrice(72000);
    }

    public void doWork(){
        System.out.println("Working going on...");
    }

    private void privateWork(){
        System.out.println("This is a private work...");
    }
}

class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        this.price = price;
    }
}