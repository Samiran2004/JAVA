package collectionAndLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //Add elements...
        for(int i = 0; i<10; i++){
            list.add(i+1);
        }
        System.out.println(list);

        //Find size...
        System.out.println("Size of the list: "+list.size());

        //Remove an element...
        list.remove(2);
        System.out.println("After remove an element...");
        System.out.println(list);

        list.remove(Integer.valueOf(7));
        System.out.println(list);

        for (int i = 0; i<10; i++){
            list2.add(i+1);
        }
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);
    }
}
