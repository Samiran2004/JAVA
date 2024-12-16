import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Leetcode1657 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st word: ");
        String word1 = input.next();
        System.out.print("Enter the 2nd word: ");
        String word2 = input.next();
        input.close();
        System.out.println(closeStrings(word1, word2));
    }

    private static boolean closeStrings(String word1, String word2) {

        /**
         * !O(N) Solution
         */
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap<Character, Integer> word1Map = new HashMap<>();
        HashMap<Character, Integer> word2Map = new HashMap<>();
        for (char c : word1.toCharArray()) {
            word1Map.put(c, (word1Map.getOrDefault(c, 0)) + 1);
        }
        for (char c : word2.toCharArray()) {
            word2Map.put(c, (word2Map.getOrDefault(c, 0)) + 1);
        }
        if (!word1Map.keySet().equals(word2Map.keySet())) {
            return false;
        }
        int[] frqArr1 = new int[word1.length() + 1];
        int[] frqArr2 = new int[word1.length() + 1];
        for (int i : word1Map.values()) {
            frqArr1[i]++;
        }
        for (int i : word2Map.values()) {
            frqArr2[i]++;
        }
        for (int i = 0; i < word1.length(); i++) {
            if (frqArr1[i] != frqArr2[i]) {
                return false;
            }
        }
        return true;

        // if (word1.length() != word2.length()) {
        // return false;
        // }
        // HashMap<Character, Integer> word1Map = new HashMap<>();
        // HashMap<Character, Integer> word2Map = new HashMap<>();
        // for (char c : word1.toCharArray()) {
        // word1Map.put(c, (word1Map.getOrDefault(c, 0)) + 1);
        // }
        // for (char c : word2.toCharArray()) {
        // word2Map.put(c, (word2Map.getOrDefault(c, 0)) + 1);
        // }
        // Set<Character> set1 = word1Map.keySet();
        // Set<Character> set2 = word2Map.keySet();
        // if(!set1.equals(set2)){
        // return false;
        // }
        // ArrayList<Integer> fArr1 = new ArrayList<>(word1Map.values());
        // ArrayList<Integer> fArr2 = new ArrayList<>(word2Map.values());
        // Collections.sort(fArr1);
        // Collections.sort(fArr2);
        // return fArr1.equals(fArr2);
    }
}
