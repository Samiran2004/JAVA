import java.util.*;
class MoveXatLast{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.next();
        moveAllX(str,0,0,"");

    }
    public static void moveAllX(String str,int idx, int count, String newStr){
        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str,idx+1,count,newStr);
        }else{
            newStr += currChar; // New String = New String + Current Char
            moveAllX(str, idx+1,count, newStr);
        }
    }
}