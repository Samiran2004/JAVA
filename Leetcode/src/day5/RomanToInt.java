import java.util.*;

public class RomanToInt{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String str = input.next();
        System.out.println(convertInt(str));
    }
    private static int convertInt(String str){
        // int length = str.length();
        // int ans = 0;
        // for(int i = 0; i<length; i++){
        //     if(str.charAt(i) == 'I'){
        //         ans += 1;
        //     }else if(str.charAt(i) == 'V'){
        //         ans += 5;
        //     }else if(str.charAt(i) == 'X'){
        //         ans += 10;
        //     }else if(str.charAt(i) == 'L'){
        //         ans += 50;
        //     }else if(str.charAt(i) == 'C'){
        //         ans += 100;
        //     }else if(str.charAt(i) == 'D'){
        //         ans += 500;
        //     }else if(str.charAt(i) == 'M'){
        //         ans += 1000;
        //     }
        // }
        // return ans;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int length = str.length();
        int ans = 0;
        for(int i = 0; i<length; i++){
            if(i<length - 1 && map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
                ans -= map.get(str.charAt(i));
            }else{
                ans += map.get(str.charAt(i));
            }
        }
        return ans;
    }
}