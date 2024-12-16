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

public class Leetcode234 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(head, 2);
        addLast(head, 2);
        addLast(head, 1);
        printList(head);
        System.out.println("The LinkedList is palindrome: " + isPalindrome(head));
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

    private static boolean isPalindrome(ListNode head) {
        ListNode slowPtr = new ListNode(-1);
        slowPtr.next = head;
        ListNode fastPtr = head;
        // !Find the middle
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        // ! Reverse the list from middle
        ListNode prevPtr = null;
        ListNode currPtr = slowPtr.next;
        while (currPtr != null) {
            ListNode nextPtr = currPtr.next;
            currPtr.next = prevPtr;
            prevPtr = currPtr;
            currPtr = nextPtr;
        }
        // !Verify
        while (prevPtr != null) {
            if (head.val != prevPtr.val) {
                return false;
            }
            head = head.next;
            prevPtr = prevPtr.next;
        }
        return true;
    }
}