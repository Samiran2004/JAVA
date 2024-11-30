import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class Leetcode876 {
    public static void main(String[] args) {
        Node head = new Node(1);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 4);
        addNode(head, 5);
        addNode(head, 6);
        Node middle = middleNode(head);
        System.out.println("Middle Node: "+ middle.data);
    }
    private static void addNode(Node head, int data) {
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new Node(data);
    }
    private static Node middleNode(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
}