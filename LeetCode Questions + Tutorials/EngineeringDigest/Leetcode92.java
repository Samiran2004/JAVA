class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class Leetcode92 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(head, 2);
        addLast(head, 3);
        addLast(head, 4);
        addLast(head, 5);
        addLast(head, 6);
        addLast(head, 7);
        addLast(head, 8);
        addLast(head, 9);
        System.out.print("Before Reversing the list is: ");
        printList(head);
        System.out.print("After Reversing: ");
        head = reverseList(head, 2, 6);
        printList(head);
    }

    private static void addLast(ListNode head, int data) {
        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new ListNode(data);
    }

    private static void printList(ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    private static ListNode reverseList(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }
        ListNode currNode = head;
        ListNode prevNode = null;
        int i = 1;
        while (currNode != null && i != left) {
            prevNode = currNode;
            currNode = currNode.next;
            i++;
        }
        ListNode pointerToStart = prevNode;
        ListNode start = currNode;
        prevNode = null;
        while (currNode != null && i != right + 1) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            i++;
        }
        start.next = currNode;
        if (pointerToStart != null) {
            pointerToStart.next = prevNode;
        } else {
            return prevNode;
        }
        return head;
    }
}
