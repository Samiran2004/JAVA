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

class Leetcode2095 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(head, 3);
        addLast(head, 4);
        addLast(head, 7);
        addLast(head, 1);
        addLast(head, 2);
        addLast(head, 6);
        printList(head);
        head = removeMiddleNode(head);
        printList(head);
    }

    private static void addLast(ListNode head, int val) {
        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new ListNode(val);
    }

    private static void printList(ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    private static ListNode removeMiddleNode(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return null;
        }
        ListNode prevNode = head;
        ListNode nextNode = head;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            prevNode = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            nextNode = slowPtr.next;
        }
        prevNode.next = nextNode;
        return head;
    }
}