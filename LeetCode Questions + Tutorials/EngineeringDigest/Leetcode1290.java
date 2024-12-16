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

public class Leetcode1290 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(head, 0);
        addLast(head, 1);
        printList(head);
        System.out.println("The Decimal value: " + getDecimalValue(head));
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

    private static int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            if (head.val == 0) {
                num = num << 1;
            } else {
                num = (num << 1) + 1;
            }
            head = head.next;
        }
        return num;
    }
}