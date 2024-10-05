import java.util.*;

public class Insertion{
    public static void main(String[] args){
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        System.out.println("In-Order traversal before insertion: ");
        inorder(root);

        int key = 7;
        root = insert(root, key);
        System.out.println("In-Order traversal after insertion: ");
        inorder(root);
    }

    static Node insert(Node root, int key){
        if(root == null) return new Node(key);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();

            // If the left child is empty, insert the new node here.
            if(temp.left == null){
                temp.left = new Node(key);
                break;
            }else{
                queue.add(temp.left);
            }

            // If the right child is empty, insert the new node here.
            if(temp.right == null){
                temp.right = new Node(key);
                break;
            }else{
                queue.add(temp.right);
            }
        }
        return root;
    }

    // In-order treversal...
    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" -> ");
        inorder(root.right);
    }
}