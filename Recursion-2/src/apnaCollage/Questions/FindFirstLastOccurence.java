package apnaCollage.Questions;

public class FindFirstLastOccurence {
    public static void main(String[] args) {
        String str = "abaachdaefaah";
        char findChar = 'h';
        findOccurence(str,0,findChar);
    }
    public static int firstOcc = -1;
    public static int lastOcc = -1;
    private static void findOccurence(String str, int idx, char findElm){
        if (idx == str.length()){
            System.out.println(firstOcc);
            System.out.println(lastOcc);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == findElm){
            if (firstOcc == -1){
                firstOcc = idx;
            }else {
                lastOcc = idx;
            }
        }
        findOccurence(str, idx+1, findElm);
    }
}
