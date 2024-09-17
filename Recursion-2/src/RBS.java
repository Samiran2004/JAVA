import java.util.Scanner;

public class RBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.printf("Enter %d number element: ",i+1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        System.out.println(search(arr,target,0,arr.length-1));
    }
    private static int search(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if (arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if (arr[start] <= target && arr[mid] >= target){
                return search(arr,target,start,mid-1);
            }else {
                return search(arr,target,mid+1,end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]){
            return search(arr,target,mid+1,end);
        }else {
            return search(arr,target,start,mid-1);
        }
    }
}
