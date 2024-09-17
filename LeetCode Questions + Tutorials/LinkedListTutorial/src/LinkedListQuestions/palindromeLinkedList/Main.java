package LinkedListQuestions.palindromeLinkedList;

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

    public Node getMid() {
        if (head == null) {
            System.out.println("List is empty...");
            return head;
        }
        Node fastPtr = head;
        Node slowPtr = head;
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
        if (head == startNode) {
            head = prevNode;
        }
        return prevNode;
    }

    public boolean isPalindrome() {
        if (head == null) {
            System.out.println("List is empty...");
            return false;
        }
        Node midNode = getMid();
        Node secHead = reverse(midNode);
        while (head != null && secHead != null) {
            if (head.data != secHead.data) {
                break;
            }
            head = head.next;
            secHead = secHead.next;
        }
        return head == null || secHead == null;
    }

    public static void main(String[] args) {
        Main list1 = new Main();
        list1.insert(10);
        list1.insert(20);
        list1.insert(30);
        list1.insert(30);
        list1.insert(20);
        list1.insert(10);
        list1.insert(40);
        list1.display();

        System.out.println(list1.isPalindrome());
    }
}
