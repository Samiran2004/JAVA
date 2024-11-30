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

public class Leetcode19 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(head, 2);
        addLast(head, 3);
        addLast(head, 4);
        addLast(head, 5);
        int n = 2;
        head = removeNthFromEnd(head, n);
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
        System.out.print("Null");
        System.out.println();
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        for(int i = 1; i <= n; i++) {
            fastPtr = fastPtr.next;
        }
        if (fastPtr == null) {
            return head.next;
        }
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        if(slowPtr != null && slowPtr.next != null){
            slowPtr.next = slowPtr.next.next;
        }
        return head;
    }
}