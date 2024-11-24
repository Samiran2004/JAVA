import java.util.*;

class Leetcode1189 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String txt = input.next();
        input.close();
        System.out.println("Total ballon: "+ maxNumberOfBalloons(txt));
    }
    private static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap();
        for(char c: text.toCharArray()){
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        int fCat = Math.min(map.getOrDefault('b', 0), Math.min(map.getOrDefault('a', 0), map.getOrDefault('n', 0)));
        System.out.println("fcat: "+ fCat);
        int sCat = Math.min(map.getOrDefault('l', 0), map.getOrDefault('o', 0));
        System.out.println("sCat: "+ sCat);
        return Math.min(sCat / 2, fCat);
    }
}