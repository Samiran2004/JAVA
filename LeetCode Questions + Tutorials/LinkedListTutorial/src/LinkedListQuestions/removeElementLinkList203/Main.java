package LinkedListQuestions.removeElementLinkList203;

public class Main {
    Node head = null;
    Node tail = null;

    void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }
    void display(){
        if (head == null){
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    void removeElements(int data){
        while (head.next != null && head.data == data){
            head = head.next;
        }
        Node currNode = head;
        while (currNode != null && currNode.next != null){
            if (currNode.next.data == data){
                currNode.next = currNode.next.next;
                continue;
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.insert(1);
        list.insert(2);
        list.insert(6);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.display();

        list.removeElements(6);
        list.display();
    }
}
