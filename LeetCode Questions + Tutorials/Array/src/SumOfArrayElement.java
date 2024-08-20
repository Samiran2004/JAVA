public class SumOfArrayElement {
    public static void main(String[] args) {
        int[] arr = {10,3,-1,-8,7,12,3,15};
        System.out.println("Sum of elements: "+sumOfElement(arr));
    }
    public static int sumOfElement(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}