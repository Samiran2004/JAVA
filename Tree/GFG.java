class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GFG {
    public static void main(String[] args) {
        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node fourthNode = new Node(5);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.right = fourthNode;
    }
}