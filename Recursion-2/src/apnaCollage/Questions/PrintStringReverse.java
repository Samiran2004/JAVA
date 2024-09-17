package apnaCollage.Questions;

public class PrintStringReverse {
    public static void main(String[] args) {
        String str = "abcd";
        printStringReverse(str.length()-1, str);
    }
    private static void printStringReverse(int idx, String str){
        if (idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printStringReverse(idx-1,str);
    }
}