public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {100,2,3,4,5,45,3,2,6};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr){
        int maxElm = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxElm){
                maxElm = arr[i];
            }
        }
        return maxElm;
    }
}
