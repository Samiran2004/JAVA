package LinkedListQuestions.removeduplicatefromsortedlist;

public class Main {
    private Node head = null;
    private Node tail = null;
    //Insert elements..
    public void insert(int data){
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

    //Display the list...
    public void display(){
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

    //Remove duplicates...
    public void removeDuplicates(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            if(currNode.data == currNode.next.data){
                currNode.next = currNode.next.next;
            }else {
                currNode = currNode.next;
            }
        }
        tail = currNode;
        tail.next = null;
    }

    public static void main(String[] args) {
        Main list1 = new Main();
        list1.insert(10);
        list1.insert(10);
        list1.insert(20);
        list1.insert(20);
        list1.insert(30);
        list1.insert(30);
        list1.insert(40);
        list1.insert(40);
        list1.display();

        list1.removeDuplicates();
        list1.display();
    }
}
