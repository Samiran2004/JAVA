import java.util.Scanner;

public class ProductNToOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        System.out.println(productOfaNumber(num));
    }

    public static int productOfaNumber(int n){
        if(n == 1){
            return 1;
        }
        return n*productOfaNumber(n-1);
    }
}