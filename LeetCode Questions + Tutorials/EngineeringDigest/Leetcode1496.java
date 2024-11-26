import java.util.*;

class Leetcode1496 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the path: ");
        String path = input.next();
        input.close();
        System.out.println(isPathCrossing(path));
    }
    private static boolean isPathCrossing(String path) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // char[] charArr = path.toCharArray();
        // for(char c: charArr) {
        //     map.put(c, map.getOrDefault(c, 0) + 1);
        // }
        // for(int i: map.values()) {
        //     if( i >= 2) {
        //         return true;
        //     }
        // }
        // return false;

        Set<String> set = new HashSet();
        int x = 0, y = 0;
        String coordinate = x + "," + y;
        set.add(coordinate);
        for(char c: path.toCharArray()) {
            if(c == 'N') {
                y++;
            }else if(c == 'W') {
                x--;
            }else if(c == 'S') {
                y--;
            }else if(c == 'E') {
                x++;
            }
            coordinate = x + "," + y;
            if(set.contains(coordinate)) {
                return true;
            }
            set.add(coordinate);
        }
        return false;
    }
}