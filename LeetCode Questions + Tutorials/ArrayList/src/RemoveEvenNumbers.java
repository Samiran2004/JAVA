import java.util.ArrayList;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //Add elements...
        for(int i = 0; i<20; i++){
            arr.add(i+1);
        }
        System.out.println("Before remove even numbers: "+ arr);
        removeElm(arr);
        System.out.println("After remove even numbers: "+arr);
    }

    public static void removeElm(ArrayList<Integer> arr){
        for(int i = 0; i<arr.size()-1; i++){
            if(arr.get(i) % 2 == 0){
                arr.remove(i);
            }
        }
    }
}
