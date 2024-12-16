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

public class Leetcode203 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(head, 2);
        addLast(head, 6);
        addLast(head, 3);
        addLast(head, 4);
        addLast(head, 5);
        addLast(head, 6);
        System.out.print("Before removing the list is: ");
        printList(head);
        System.out.print("After removing: ");
        head = removeElements(head, 6);
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

    private static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.data == val) {
            head = head.next;
        }
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.next.data == val) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }
}
