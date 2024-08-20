package basics;

import encapsulation.EncapsulationIntro;

public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.name = "Samiran Samanta";
//        p1.age = 20;
//        System.out.println(p1.name+ " "+ p1.age);
//        p1.eat();
//
//        Person p2 = new Person();
//        p2.name = "Kiddo";
//        p2.age = 10;
//        System.out.println(p2.name+ " "+ p2.age);
//        p2.walk();
//        p2.walk(200);
//
//        System.out.println("Total person created: "+Person.count);
//
//        Person p3 = new Person(30,"Rayan Ghosh");
//        System.out.println(p3.name+" "+p3.age);
//        p3.walk(500);
//        System.out.println("Total person created: "+Person.count);

//        Developer d1 = new Developer(21,"Samiran Samanta");
//        d1.walk();
//        d1.walk(200);

        EncapsulationIntro obj = new EncapsulationIntro();
        obj.doWork();
    }
}

class Person{
    String name;
    int age;
    static int count;

//    public Person(){
//        System.out.println("Creating an object");
//        count++;
//    }

    public Person(int age, String name){
//        this();
        this.name = name;
        this.age = age;
    }

    void walk(){
        System.out.println(name+ " is walking.");
    }

    void eat(){
        System.out.println(name+" is eating.");
    }

    void walk(int steps){
        System.out.println(name+" walked "+steps+" steps.");
    }
}

//Child Class....
class Developer extends Person{
    public Developer(int age, String name){
        super(age,name);
    }

    void walk(){
        System.out.println("Developer "+name+" is walk");
    }
}