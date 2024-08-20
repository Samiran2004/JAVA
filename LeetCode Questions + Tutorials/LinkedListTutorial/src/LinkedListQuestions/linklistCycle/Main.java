package LinkedListQuestions.linklistCycle;

public class Main {
    private Node head = null;
    private Node tail = null;
    private int size;

    // Insert elements...
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        Node currNode = head;
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    // Create cycle...
    public void createCycle(int idx) {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        int i = 0;
        while (i < idx && currNode.next != null) {
            i++;
            currNode = currNode.next;
        }
        tail.next = currNode;
    }

    // Check cycle...
    public boolean checkCycle() {
        if (head == null) {
            System.out.println("List is empty...");
            return false;
        }
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (fastPtr == slowPtr) {
                size = getLength(slowPtr);
                return true;
            }
        }
        return false;
    }

    // Get Length of cycle...
    public int getLength(Node slowPtr) {
        Node tempNode = slowPtr;
        int length = 0;
        do {
            tempNode = tempNode.next;
            length++;
        } while (tempNode != slowPtr);
        return length;
    }

    // Get size...
    public int getSize() {
        return size;
    }

    // Display list...
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

    public static void main(String[] args) {
        Main list1 = new Main();
        list1.insert(10);
        list1.insert(20);
        list1.insert(30);
        list1.insert(40);
        list1.insert(50);
        list1.insert(60);
        list1.insert(70);
        list1.insert(80);
        list1.insert(90);
        list1.display();

        list1.createCycle(3);
        System.out.println(list1.checkCycle());
        System.out.println(list1.getSize());

    }
}
