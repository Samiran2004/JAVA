package LinkedListQuestions.sortList;

public class Main {
    private Node head = null;
    private Node tail = null;

    public void insert(int data) {
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
        System.out.println("Null");
    }

    public void sortList() {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            Node minNode = currNode;
            Node temp = currNode.next;
            while (temp != null) {
                if (temp.data < minNode.data) {
                    minNode = temp;
                }
                temp = temp.next;
            }
            int tempData = currNode.data;
            currNode.data = minNode.data;
            minNode.data = tempData;
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Main list1 = new Main();
        list1.insert(50);
        list1.insert(40);
        list1.insert(30);
        list1.insert(10);
        list1.insert(20);
        list1.display();
        list1.sortList();
        list1.display();
    }
}
