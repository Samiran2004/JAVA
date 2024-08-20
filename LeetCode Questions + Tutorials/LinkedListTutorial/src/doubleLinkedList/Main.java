package doubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list1 = new DoubleLinkedList();
        list1.addFirst(10);
        list1.addFirst(20);
        list1.addFirst(30);
        list1.display();
        list1.getSize();

        list1.addLast(40);
        list1.addLast(50);
        list1.addLast(60);
        list1.display();
        list1.getSize();

        list1.deleteFirst();
        list1.display();
        list1.getSize();

        list1.deleteLast();
        list1.display();
        list1.getSize();

        list1.addIndex(4,999);
        list1.display();
        list1.getSize();

        list1.deleteIndex(3);
        list1.display();
        list1.getSize();
    }
}