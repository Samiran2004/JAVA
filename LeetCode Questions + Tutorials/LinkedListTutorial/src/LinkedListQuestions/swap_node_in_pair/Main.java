package LinkedListQuestions.swap_node_in_pair;

public class Main {
    private Node head = null;
    private Node tail = null;

    private void insert(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }
    private void display(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    private void swapInPair(){
        if (head == null && head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next.next;
        head = head.next;
        head.next = prevNode;
        while (currNode != null && currNode.next != null){
            prevNode.next = currNode.next;
            prevNode = currNode;
            Node tempNode = currNode.next.next;
            currNode.next.next = currNode;
            currNode = tempNode;
        }
        prevNode.next = currNode;
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        list.swapInPair();
        list.display();
    }
}
