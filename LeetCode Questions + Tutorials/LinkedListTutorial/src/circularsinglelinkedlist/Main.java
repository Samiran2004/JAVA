package circularsinglelinkedlist;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list1 = new CircularLinkedList();

        list1.addFirst(10);
        list1.addFirst(20);
        list1.addFirst(30);
        list1.addFirst(40);
        list1.display();
        list1.getSize();

        list1.addLast(50);
        list1.addLast(60);
        list1.addLast(70);
        list1.addLast(80);
        list1.display();
        list1.getSize();
    }
}
