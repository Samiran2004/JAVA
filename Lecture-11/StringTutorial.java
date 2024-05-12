public class StringTutorial {
    public static void main(String[] args) {
        // String name = "Samiran Samanta";
        // System.out.println(name);

        // String a = "Samiran";
        // String b = "Samanta";
        // a = "Guddu";

        // // String Comparison....
        String a = "Samiran";
        String b = "Samiran";
        System.out.println(a == b);
        String c = new String("Guddu");
        String d = new String("Guddu");
        System.out.println(c == b);

        //Method....
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));

        System.out.println(a.charAt(0));
    }
}