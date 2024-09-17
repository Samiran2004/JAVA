package generics;

public class GenericsClass {
    public static void main(String[] args) {
        Dog d1 = new Dog("FFc45");
        System.out.println(d1.id);

        Cat<Integer, String> c1 = new Cat<>(721154);
        Cat<String, Integer> c2 = new Cat<>("HjCC56");
        Cat<Integer, String> c3 = new Cat<>(7665,"Jerry");

        System.out.println(c1.id);
        System.out.println(c2.id);
        System.out.println(c3.id+" "+c3.name);
        System.out.println(c1.getId());
    }
}
class Dog{
    String id;
    Dog(String id){
        this.id = id;
    }
}
class Cat<E,V>{
    E id;
    V name;
    public Cat(E id){
        this.id = id;
    }
    public Cat(E id, V name){
        this.id = id;
        this.name = name;
    }

    E getId(){
        return this.id;
    }
}