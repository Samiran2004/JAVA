package collectionAndLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListItrator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Iterator<String> fe = fruits.iterator();
        while (fe.hasNext()){
            System.out.println(fe.next());
        }
    }
}