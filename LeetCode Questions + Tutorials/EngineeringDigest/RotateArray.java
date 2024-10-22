import java.util.*;;

public class RotateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the  value of d: ");
        int d = input.nextInt();
        input.close();
        rotateArray(arr, d);
    }

    private static void rotateArray(int[] arr, int d) {
        if (arr.length == 0 || d == 0) {
            return;
        }
        // 1. Create a temp array and store first d element...
        int[] tempArr = new int[d];
        for (int i = 0; i < d; i++) {
            tempArr[i] = arr[i];
        }
        // 2. Shift the remaining elements...
        for (int i = 0; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }
        // 3. Insert the tempArr elements...
        for (int i = 0; i < tempArr.length; i++) {
            arr[arr.length - d + i] = tempArr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
