package apnaCollage;

public class SumOfNnaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int sum = 0;
        printSumOfNaturalNum(i,n,sum);
    }
    private static void printSumOfNaturalNum(int i, int n, int sum){
        if (i == n){
            sum += i;
            System.out.println("Sum: "+sum);
            return;
        }
        sum += i;
        printSumOfNaturalNum(i+1,n,sum);
    }
}
