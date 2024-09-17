import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        long salary = input.nextLong();
        input.close();

        // if (salary > 10000) {
        //     salary += 2000;
        // } else {
        //     salary += 1000;
        // }

        if(salary > 10000){
            salary += 2000;
        }else if(salary > 20000){
            salary += 3000;
        }else{
            salary += 1000;
        }
        System.out.print("Your salary: " + salary);
    }

}