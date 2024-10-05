import java.util.*;

class Traversal {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.left.left = new Node(6);
        System.out.println("<----------------In-Order DFS---------------->");
        inOrderDFS(root);
        System.out.println();
        System.out.println("<----------------Pre-Order DFS---------------->");
        preOrderDFS(root);
        System.out.println();
        System.out.println("<----------------Post-Order DFS---------------->");
        postOrderDFS(root);
        System.out.println();
        System.out.println("<----------------Level-Order DFS---------------->");
        BFS(root);
    }

    // In order DFS: Left -> Root -> Right
    static void inOrderDFS(Node node) {
        if (node == null) {
            return;
        }
        inOrderDFS(node.left);
        System.out.print(node.data + " -> ");
        inOrderDFS(node.right);
    }

    // Pre order DFS: Root -> Left -> Right
    static void preOrderDFS(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " -> ");
        preOrderDFS(node.left);
        preOrderDFS(node.right);
    }

    // Post order DFS: Left -> Right -> Root
    static void postOrderDFS(Node node) {
        if (node == null) {
            return;
        }
        postOrderDFS(node.left);
        postOrderDFS(node.right);
        System.out.print(node.data + " -> ");
    }

    // BFS: Level order traversal
    static void BFS(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.data+" -> ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
    }
}