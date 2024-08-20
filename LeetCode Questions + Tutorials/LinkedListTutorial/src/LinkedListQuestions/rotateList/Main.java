package LinkedListQuestions.rotateList;

public class Main {
    private Node head = null;
    private Node tail = null;

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
        System.out.println("NULL");
    }

    public void rotate(int k) {
        if (k <= 0 || head == null || head.next == null) {
            return;
        }
        // Find the length of the list...
        int length = 1;
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            length++;
        }
        k = k % length;
        if (k <= 0) {
            return;
        }
        int newLastNode = length - k - 1;
        Node newTail = head;
        for (int i = 0; i < newLastNode; i++) {
            newTail = newTail.next;
        }
        // Rotate the list...
        Node newHead = newTail.next;
        newTail.next = null;
        lastNode.next = head;
        head = newHead;
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.display();

        list.rotate(6);
        list.display();
    }
}
