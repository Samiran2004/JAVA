package singlelinkedlist;

public class Main {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    private Node head;

    //Add -- First, Last...
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
    }

    //Print the LinkedList...
    public void printList(){
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" --> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        Main newList = new Main();
        newList.addFirst(1);
        newList.addFirst(2);
        newList.addLast(3);
        newList.addLast(30);
        newList.addLast(32);
        newList.printList();
    }
}
