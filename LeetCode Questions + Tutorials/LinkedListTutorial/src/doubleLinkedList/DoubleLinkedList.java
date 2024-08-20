package doubleLinkedList;

public class DoubleLinkedList {
    private Node head = null;
    private int size;
    DoubleLinkedList(){
        this.size = 0;
    }

    //Add first...
    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //Add last...
    public void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        newNode.prev = currNode;
        currNode.next = newNode;
    }

    //Add a given position...
    public void addIndex(int pos, int data) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position...");
            return;
        }
        Node newNode = new Node(data);
        if (pos == 0) {
            addFirst(data);
        } else if (pos == size) {
            addLast(data);
        } else {
            Node currNode = head;
            int i = 0;
            while (i < pos - 1) {
                currNode = currNode.next;
                i++;
            }
            newNode.next = currNode.next;
            newNode.prev = currNode;
            if (currNode.next != null) {
                currNode.next.prev = newNode;
            }
            currNode.next = newNode;
            size++;
        }
    }

    //Delete first...
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        head.next.prev = head;
        head = head.next;
        size--;
    }

    //Delete last...
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
        size--;
    }

    //Delete a given position...
    public void deleteIndex(int position){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        if (position == 1){
            head = head.next;
            if (head != null){
                head.prev = null;
                return;
            }
            size--;
        }
        Node currNode = head;
        for (int i = 1; i<position; i++){
            currNode = currNode.next;
        }
        currNode.prev.next = currNode.next;
        if (currNode.next != null) {
            currNode.next.prev = currNode.prev;
        }
        size--;
    }

    //Print the LinkedList...
    public void display(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //Get the size of the linked list...
    public void getSize(){
        System.out.println("Size of the linked list is: "+size);
    }
}
