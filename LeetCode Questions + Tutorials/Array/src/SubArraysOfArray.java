import java.util.Arrays;

public class SubArraysOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        for(int startIdx = 0; startIdx<arr.length; startIdx++){
            for (int endIdx = startIdx; endIdx<arr.length; endIdx++){
                for (int k = startIdx; k<endIdx; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
