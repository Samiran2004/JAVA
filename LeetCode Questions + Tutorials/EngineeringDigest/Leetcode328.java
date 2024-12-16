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

public class Leetcode328 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(head, 2);
        addLast(head, 3);
        addLast(head, 4);
        addLast(head, 5);
        printList(head);
        head = oddEvenList(head);
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

    private static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode evenHead = evenNode;
        while (evenNode != null && evenNode.next != null) {
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;
            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenHead;
        return head;
    }
}
