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

public class Leetcode82 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(head, 2);
        addLast(head, 3);
        addLast(head, 3);
        addLast(head, 4);
        addLast(head, 4);
        addLast(head, 5);
        printList(head);
        head = deleteDuplicates(head);
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

    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prevNode = dummyNode;
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.data == currNode.next.data) {
                while (currNode.next != null && currNode.data == currNode.next.data) {
                    currNode = currNode.next;
                }
                prevNode.next = currNode.next;
            } else {
                prevNode = currNode;
            }
            currNode = currNode.next;
        }
        return dummyNode.next;
    }
}
