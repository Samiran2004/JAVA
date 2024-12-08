import java.util.ArrayList;

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

public class Leetcode2181 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        addLast(head, 3);
        addLast(head, 1);
        addLast(head, 0);
        addLast(head, 4);
        addLast(head, 5);
        addLast(head, 2);
        addLast(head, 0);
        printList(head);
        ListNode newHead = mergeNodes(head);
        printList(newHead);
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

    private static ListNode mergeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode currNode = head;
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        while (currNode != null) {
            if (currNode.val != 0) {
                while (currNode.val != 0) {
                    sum += currNode.val;
                    currNode = currNode.next;
                }
                arr.add(sum);
                sum = 0;
            } else {
                currNode = currNode.next;
            }
        }
        // !Create a new LinkedList and return it
        ListNode newHead = new ListNode(arr.get(0));
        ListNode tailNode = newHead;
        for (int i = 1; i < arr.size(); i++) {
            ListNode newNode = new ListNode(arr.get(i));
            tailNode.next = newNode;
            tailNode = newNode;
        }
        return newHead;
    }
}