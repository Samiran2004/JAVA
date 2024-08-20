package LinkedListQuestions.reorderLinkedList;

public class Main {
    private Node head = null;
    private Node tail = null;

    private void insert(int data) {
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

    private void display() {
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

    public Node getMidNode() {
        if (head == null) {
            System.out.println("List is empty....");
            return head;
        }
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public Node reverse(Node startNode) {
        Node prevNode = null;
        Node currNode = startNode;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public void reorderList() {
        if (head == null && head.next != null) {
            System.out.println("List is empty...");
            return;
        }
        Node midNode = getMidNode();
        Node startHead = head;
        Node endHead = reverse(midNode);
        Node FtempNode = startHead.next;
        Node EtempNode = endHead.next;
        while (endHead != null && EtempNode != null) {
            startHead.next = endHead;
            startHead.next.next = FtempNode;
            startHead = FtempNode;
            endHead = EtempNode;
            FtempNode = startHead.next;
            EtempNode = endHead.next;
        }
    }

    public static void main(String[] args) {
        Main list1 = new Main();
        list1.insert(10);
        list1.insert(20);
        list1.insert(30);
        list1.insert(40);
        list1.insert(50);
        list1.display();

        list1.reorderList();
        list1.display();
    }
}
