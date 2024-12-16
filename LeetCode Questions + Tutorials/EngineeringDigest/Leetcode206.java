class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Leetcode206 {
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
        printList(head);
        System.out.println("After Reverse: ");
        reverseList(head);
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
            System.out.print(currNode.val + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode presNode = head;
        ListNode nextNode;
        while (presNode != null) {
            nextNode = presNode.next;
            presNode.next = prevNode;
            prevNode = presNode;
            presNode = nextNode;
        }
        return prevNode;
    }
}