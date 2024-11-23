import java.util.*;

class Leetcode1941 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        input.close();
        System.out.println(areOccurrencesEqual(str));
    }
    private static boolean areOccurrencesEqual(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charArr = str.toCharArray();
        for(char c: charArr){
            charCountMap.put(c, charCountMap.getOrDefault(c , 0)+1);
        }
        int count = -1;
        for (int value : charCountMap.values()) {
            if (count == -1) {
                count = value; // Set the first count
            } else if (count != value) {
                return false; 
            }
        }

        return true;
    }
}