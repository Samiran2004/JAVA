package introduction;

public class Main {
    public static void main(String[] args) {
        //Store 5 roll numbers...
//        int[] rolls = new int[5];
        //Store 5 names...
//        String[] names = new String[5];

//        Student[] students = new Student[5];

//        Student samiran = new Student();
//        samiran.rollNumber = 42;
//        samiran.marks = 76.7f;
//        System.out.println(samiran.name);
//        System.out.println(samiran.rollNumber);
//        System.out.println(samiran.marks);

        Student rahul = new Student();
        rahul.name = "Rahul Das";
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
        System.out.println(rahul.rollNumber);
        rahul.greeting();

        Student Samiran = new Student(42,"Samiran Samanta", 87.8f);
        System.out.println(Samiran.marks);
        System.out.println(Samiran.name);
        System.out.println(Samiran.rollNumber);
        Samiran.greeting();
    }
}

//Create a student class...
class Student {
    int rollNumber;
    String name;
    float marks;
    void greeting(){
        System.out.println("Hello my name is "+this.name);
        System.out.println("My roll number is "+this.rollNumber);
        System.out.println("My marks is "+this.marks);
    }
    Student (){
        this.rollNumber = 12;
        this.name = "Ram Prasad";
        this.marks = 89.45f;
    }

    Student (int rollNumber, String name, float marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
}