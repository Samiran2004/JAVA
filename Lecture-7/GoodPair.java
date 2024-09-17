import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println("Good pair result: " + findGoodPair(arr));
    }

    static int findGoodPair(int[] arr) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
