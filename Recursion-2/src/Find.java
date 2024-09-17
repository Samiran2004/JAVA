import java.util.ArrayList;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.printf("Enter %d number element: ",i+1);
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        input.close();
        System.out.println(find(arr, target, 0));
        System.out.println(findAllIndex(arr,target,0,new ArrayList<>()));
    }
    //Linear search using recursion...
    private static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    //Find all indexes like [1, 2, 4, 4, 3, 6] and the target element is 4 then return an arraylist [2, 3]
    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (target == arr[index]){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
