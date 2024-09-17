public class LL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;
    LL(){
        this.size = 0;
    }

    //Add First...
    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Add Last...
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
        currNode.next = newNode;
    }

    //Insert at a given position...
    public void insertPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head.next;
            head = newNode;
            return;
        }
        Node currNode = head;
        int i = 1;
        while (i<position-1){
            currNode = currNode.next;
            i++;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    //Delete first...
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete last...
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        size--;
        Node currNode = head;
        while (currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    //Delete at any given position...
    public void deleteAny(int position){
        if(head == null){
            System.out.println("LinkedList is empty...");
            return;
        }
        if (position == 1 && size == 1) {
            head.next = null;
            return;
        } else if (position == 1 && size != 1) {
            head = head.next;
            return;
        }
        Node currentNode = head;
        int i = 1;
        while (i<position-1){
            currentNode = currentNode.next;
            i++;
        }
        currentNode.next = currentNode.next.next;
    }

    //Print LinkedList...
    public void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        while (currNode != null){
            System.out.print(currNode.data +"-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        System.out.print("LinkedList after add first:   ");
        linkedList.printList();
        System.out.println("The size of the LinkedList: "+linkedList.getSize());

        linkedList.addLast(50);
        linkedList.addLast(60);
        linkedList.addLast(70);
        linkedList.addLast(80);
        System.out.print("LinkedList after add last:   ");
        linkedList.printList();
        System.out.println("The size of the LinkedList: "+linkedList.getSize());

        linkedList.deleteFirst();
        System.out.print("LinkedList after delete from first:   ");
        linkedList.printList();
        System.out.println("The size of the LinkedList: "+linkedList.getSize());

        linkedList.deleteLast();
        System.out.print("LinkedList after delete from last:   ");
        linkedList.printList();

        System.out.println("The size of the LinkedList: "+linkedList.getSize());

        System.out.println("Insert at any position: ");
        linkedList.insertPosition(99,3);
        linkedList.printList();

        System.out.println("Delete at given position: ");
        linkedList.deleteAny(3);
        linkedList.printList();
    }
}
