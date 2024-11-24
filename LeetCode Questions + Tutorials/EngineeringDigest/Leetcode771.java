import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode771 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter jewels string: ");
        String jewels = input.next();
        System.out.print("Enter stones string: ");
        String stones = input.next();
        input.close();
        System.out.println(numJewelsInStones(jewels, stones));
    }

    private static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> jewelSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            char currStone = stones.charAt(i);
            if (jewelSet.contains(currStone)) {
                count++;
            }
        }
        return count;
    }
}
