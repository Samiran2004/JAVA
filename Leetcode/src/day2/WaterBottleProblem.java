package day2;

import java.util.Scanner;

public class WaterBottleProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of bottles: ");
        int numBottles = input.nextInt();
        System.out.print("Enter number of exchange: ");
        int numExchange = input.nextInt();

        System.out.println(numWaterBottles(numBottles,numExchange));
    }

    static int numWaterBottles(int numBottles, int numExchange){
        int total = numBottles;

        while (numBottles>=numExchange){
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            total += newBottles;

            numBottles = newBottles+remBottles;
        }


        return total;
    }
}