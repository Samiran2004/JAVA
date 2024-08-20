import java.util.LinkedList;

public class LinkedListCollectionFW {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        System.out.println("List after add first: "+list);
        System.out.println("Size: "+list.size());

        list.addLast(3);
        list.addLast(4);
        System.out.println("List after add last: "+list);
        System.out.println("Size: "+list.size());

        list.removeFirst();
        System.out.println("List after delete first: "+list);
        System.out.println("Size: "+list.size());

        list.removeLast();
        System.out.println("List after delete last: "+list);
        System.out.println("Size: "+list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("Null");
    }
}