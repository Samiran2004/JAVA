package apnaCollage;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int num = 5;
        int ans = printFactorial(num);
        System.out.println(ans);
    }
    private static int printFactorial(int num){
        if (num == 1 || num == 0){
            return 1;
        }
        int fact_n1 = printFactorial(num - 1);
        int fact_n = fact_n1 * num;
        return  fact_n;
    }
}
