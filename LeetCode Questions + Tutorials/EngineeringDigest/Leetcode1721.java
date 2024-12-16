import java.util.ArrayList;

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

public class Leetcode1721 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        addLast(head, 2);
        addLast(head, 3);
        addLast(head, 4);
        addLast(head, 5);
        System.out.print("Before swapping: ");
        printList(head);
        System.out.print("After swapping: ");
        head = swapNodes(head, 2);
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
        System.out.println("Null");
    }

    private static ListNode swapNodes(ListNode head, int k) {
        // * Add List elements into an array.
        ArrayList<Integer> listArr = new ArrayList<>();
        ListNode currNode = head;
        while (currNode != null) {
            listArr.add(currNode.data);
            currNode = currNode.next;
        }
        // ! validate the value of k
        int arrLen = listArr.size();
        if (k < 1 || k > arrLen) {
            return head;
        }

        // ! Swap the elements
        int leftIndex = k - 1;
        int rightIndex = arrLen - k;
        int temp = listArr.get(leftIndex);
        listArr.set(leftIndex, listArr.get(rightIndex));
        listArr.set(rightIndex, temp);

        // ! Rebuild the linked list from the modified ArrayList
        ListNode newHead = new ListNode(listArr.get(0));
        ListNode tail = newHead;
        for (int i = 1; i < listArr.size(); i++) {
            tail.next = new ListNode(listArr.get(i));
            tail = tail.next;
        }
        // ! Return the new head
        return newHead;
    }
}