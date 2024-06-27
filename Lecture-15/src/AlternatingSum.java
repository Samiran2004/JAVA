import java.util.Scanner;

public class AlternatingSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int digit = input.nextInt();
        input.close();
        System.out.println(findAlterDigitSum(digit));
    }

    public static int findAlterDigitSum(int digit){
        char operator = '+';
        int sum = 0;
        String intStr = Integer.toString(digit);
        for (int i = 0; i<intStr.length(); i++){
            int num = Character.getNumericValue(intStr.charAt(i));
            if(operator == '-'){
                sum -= num;
                operator = '+';
            }else {
                sum += num;
                operator = '-';
            }
        }
        return sum;
    }
}
