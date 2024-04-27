import java.util.Scanner;

public class FindMaximumElm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        int maxElm = 0;
        for (int i = 0; i < size; i++) {
            if (maxElm < arr[i]) {
                maxElm = arr[i];
            }
        }
        System.out.println("Maximum element: " + maxElm);
        input.close();
    }
}
