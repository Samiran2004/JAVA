package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4.6,7.8,5.6);
//        Box box2 = new Box(box);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.weight+ " "+box3.l);

        Box box4 = new BoxWeight(2,3,4,5);
        System.out.println(box4.w);

//        BoxWeight box5 = new Box(1,2,3);
    } 
}