import java.util.*;

class Deletion {
    public static void main(String[] args){
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.left.left.right = new Node(8);
        System.out.print("Original tree [In-Order]: ");
        inorder(root);
        System.out.println();
        System.out.print("Tree after deleting: ");
        int val = 5;
        root = deleteNode(root, val);
        inorder(root);
        System.out.println();
    }

    // Function to delete a node from binary tree...
    static Node deleteNode(Node root, int val) {
        if(root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node target = null;

        while(!queue.isEmpty()){
            Node curr = queue.poll();
            if(curr.data == val){
                target = curr;
                break;
            }
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
        if(target == null) return root;

        //Find the deepest rightmost node and its parent
        Node lastNode = null;
        Node lastParent = null;
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> parentQueue = new LinkedList<>();
        q1.add(root);
        parentQueue.add(null);
        while(!q1.isEmpty()){
            Node curr = q1.poll();
            Node parent = parentQueue.poll();

            lastNode = curr;
            lastParent = parent;
            if(curr.left != null){
                q1.add(curr.left);
                parentQueue.add(curr);
            }
            if(curr.right != null){
                q1.add(curr.right);
                parentQueue.add(curr);
            }
        }

        //Replace target's value with the last node's value...
        target.data = lastNode.data;

        // Remove the last node...
        if(lastParent != null){
            if(lastParent.left == lastNode) lastNode.left = null;
            else lastParent.right = null;
        }else{
            return null;
        }
        return root;
    }

    // In-Order Traversal...
    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" -> ");
        inorder(root.right);
    }
}