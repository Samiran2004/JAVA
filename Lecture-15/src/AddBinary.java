import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st binary number: ");
        String num1 = input.next();
        System.out.print("Enter 2nd binary number: ");
        String num2 = input.next();
        input.close();
        System.out.println(addBinary(num1,num2));
    }

    public static String addBinary(String num1, String num2){
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        int base = 2;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j >= 0){
            int t1=0,t2=0,sum;
            if(i>=0){
                t1 = num1.charAt(i) - '0';
                i--;
            }if(j>=0){
                t2 = num2.charAt(j) - '0';
                j--;
            }
            sum = t1+t2+carry;
            if(sum>=base){
                carry = 1;
                sum -= base;
            }else {
                carry = 0;
            }
            result.append(sum);
        }
        if(carry == 1){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
