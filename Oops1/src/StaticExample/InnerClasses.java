package StaticExample;

public class InnerClasses {
   static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
        public String toString(){
            return name;
        }
    }
    public static void main(String[] args) {
        Test samiran = new Test("Samiran Samanta");
        System.out.println(samiran.name);

        Test rahul = new Test("Rahul Das");
        System.out.println(rahul.name);
        System.out.println(samiran.toString());
    }
}

//class Test{
//    String name;
//    public Test(String name){
//        this.name = name;
//    }
//}