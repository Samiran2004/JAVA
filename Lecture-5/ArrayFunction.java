import java.util.Arrays;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println("Beore changing...");
        System.out.println(Arrays.toString(nums));

        System.out.println("After changing...");
        changeArr(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void changeArr(int[] arr) {
        arr[0] = 999;
    }
}
