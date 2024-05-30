import java.util.Scanner;

public class PermutationCombition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st word: ");
        String firstStr = input.next();
        System.out.print("Enter the 2nd word: ");
        String secondStr = input.next();
        input.close();
        System.out.println(findPermutationDifference(firstStr,secondStr));
    }

    public static int findPermutationDifference(String s, String t){
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            sum += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return sum;
    }
}