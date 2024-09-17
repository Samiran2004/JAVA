import java.util.Scanner;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstStr = input.next();
        System.out.print("Enter second string: ");
        String secondStr = input.next();
        input.close();
        System.out.println(checkIsomorphicString(firstStr,secondStr));
    }

    public static boolean checkIsomorphicString(String str1, String str2){
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<str1.length()-1; i++){
            for(int j = i+1; j<str1.length(); j++){
                if(str1.charAt(i) != str1.charAt(j)){
                    count1++;
                }
            }
        }
        for(int i = 0; i<str2.length()-1; i++){
            for(int j = i+1; j<str2.length(); j++){
                if(str2.charAt(i) != str2.charAt(i+1)){
                    count2++;
                }
            }
        }
        return count1 == count2;
    }
}
