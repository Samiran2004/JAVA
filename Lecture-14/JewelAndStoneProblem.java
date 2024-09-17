//You're given strings jewels representing the types of stones that are jewels,
// and stones representing the stones you have.
// Each character in stones is a type of stone you have.
// You want to know how many of the stones you have are also jewels.
//
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
import java.util.Scanner;

public class JewelAndStoneProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the stones: ");
        String stones = input.next();
        System.out.print("Enter the jewels: ");
        String jewels = input.next();
        input.close();

        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
//        for(int i = 0; i<stones.length(); i++){
//            for(int j = 0; j<jewels.length(); j++){
//                if(stones.charAt(i) == jewels.charAt(j)){
//                    count++;
//                }
//            }
//        }

        for (int i = 0; i < jewels.length(); i++) {
            if(stones.indexOf(jewels.charAt(i))>-1){
                count++;
            }
        }
        return count;
    }
}