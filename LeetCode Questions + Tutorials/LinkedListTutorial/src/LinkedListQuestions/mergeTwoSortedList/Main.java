package LinkedListQuestions.mergeTwoSortedList;

public class Main {
    private Node head = null;
    private Node tail = null;

    private void insertElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static Main mergeLists(Main list1, Main list2) {
        Node firstHead = list1.head;
        Node secHead = list2.head;
        Main ans = new Main();
        while (firstHead != null && secHead != null) {
            if (firstHead.data < secHead.data) {
                ans.insertElement(firstHead.data);
                firstHead = firstHead.next;
            } else {
                ans.insertElement(secHead.data);
                secHead = secHead.next;
            }
        }
        while (firstHead != null) {
            ans.insertElement(firstHead.data);
            firstHead = firstHead.next;
        }
        while (secHead != null) {
            ans.insertElement(secHead.data);
            secHead = secHead.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        Main list1 = new Main();
        Main list2 = new Main();
        list1.insertElement(10);
        list1.insertElement(20);
        list1.insertElement(30);
        list2.insertElement(10);
        list2.insertElement(20);
        list2.insertElement(30);
        list2.insertElement(40);
        list1.display();
        list2.display();

        Main mergeAns = Main.mergeLists(list1, list2);
        mergeAns.display();
    }
}
