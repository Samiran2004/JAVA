package circularsinglelinkedlist;

public class CircularLinkedList {
    private Node head = null;
    private Node tail = null;
    private int size;
    CircularLinkedList(){
        this.size = 0;
    }

    //Add first...
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    //Add last...
    public void addLast(int data){
        size++;
        if(head == null){
            addFirst(data);
        }else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    //Print the list...
    public void display(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        do {
            System.out.print(currNode.data+" --> ");
            currNode = currNode.next;
        }while (currNode != head);
        System.out.print(" NULL");
        System.out.println();
    }
    //Get size of the list...
    public void getSize(){
        System.out.println("Size of the list: "+size);
    }
}