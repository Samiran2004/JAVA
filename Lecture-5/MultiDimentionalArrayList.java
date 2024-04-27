import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimentionalArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialization...
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Add element...
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the element: ");
                list.get(i).add(input.nextInt());
            }
        }

        input.close();
        System.out.println(list);
    }
}
