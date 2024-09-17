package LinkedListQuestions.middleOfALinkedlist;

public class Main {
    private Node head;
    private Node tail;

    public void insert(int data) {
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

    public int middleNode() {
        if (head == null) {
            System.out.println("List is empty...");
            return head.data;
        } else {
            Node slowPtr = head;
            Node fastPtr = head;
            while (fastPtr != null && fastPtr.next != null) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }
            return slowPtr.data;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Main list1 = new Main();
        list1.insert(10);
        list1.insert(20);
        list1.insert(30);
        list1.insert(40);
        list1.insert(50);
        list1.insert(60);
        list1.display();
        System.out.println(list1.middleNode());
    }
}
