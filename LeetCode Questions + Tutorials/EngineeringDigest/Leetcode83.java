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

public class Leetcode83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(2, head);
        addLast(2, head);
        addLast(4, head);
        addLast(5, head);
        addLast(6, head);
        printList(head);
        System.out.println("After removing");
        removeDuplicate(head);
        printList(head);
    }

    private static void addLast(int data, ListNode head) {
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

    private static ListNode removeDuplicate(ListNode head) {
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if(currNode.data == currNode.next.data) {
                currNode.next = currNode.next.next;
            }else{
                currNode = currNode.next;
            }
        }
        return head;
    }
}
