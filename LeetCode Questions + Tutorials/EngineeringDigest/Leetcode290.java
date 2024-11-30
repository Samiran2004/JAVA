import java.util.*;

class Leetcode290 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Word: ");
        String word = input.next();
        input.nextLine();
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        input.close();
        System.out.println(wordPattern(word, str));
    }

    private static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();
        String[] sArr = s.split(" ");
        if (sArr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char currChar = pattern.charAt(i);
            String currWord = sArr[i];
            if (map.containsKey(currChar) && !map.get(currChar).equals(currWord)) {
                return false;
            }
            if (reverseMap.containsKey(currWord) && reverseMap.get(currWord) != currChar) {
                return false;
            }
            map.put(currChar, currWord);
            reverseMap.put(currWord, currChar);
        }

        return true;
    }
}