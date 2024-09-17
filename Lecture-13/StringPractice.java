import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter your first name: ");
        // String firstName = input.nextLine();
        // System.out.print("Enter your last name: ");
        // String lastName = input.nextLine();
        // input.close();
        // System.out.println("Your name is: " + firstName + " " + lastName);
        // System.out.println(firstName + lastName);
        // System.out.println(firstName.toUpperCase());
        // System.out.println(firstName.toLowerCase());
        // System.out.println(firstName.trim());
        // System.out.println(firstName.startsWith("S"));
        // System.out.println(firstName.endsWith("an"));
        // System.out.println(firstName.equals("Samiran"));
        // System.out.println(firstName.equalsIgnoreCase("samiran"));
        // System.out.println(firstName.charAt(3));

        // int age = 20;
        // String strAge = String.valueOf(age);
        // System.out.println(age);
        // System.out.println(strAge);

        String sentence = "Hello this is JavaScript tutorial";
        String newSentence = sentence.replace("JavaScript", "Java");
        System.out.println(sentence);
        System.out.println(newSentence);
        System.out.println(sentence.contains("Hello"));
        System.out.println(newSentence.substring(2,5));
        System.out.println(Arrays.toString(newSentence.split(" ")));

        char[] charArr = newSentence.toCharArray();
        System.out.println(Arrays.toString(charArr));
    }
}
