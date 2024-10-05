class Search{
    public static void main(String[] args){
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.left.left.left = new Node(7);
        root.left.right.left = new Node(8);

        int key = 8;
        if(searchDFD(root, key)){
            System.out.println(key+" is found in the binary tree.");
        }else{
            System.out.println(key+" is not found in the binary tree.");
        }
    }

    static boolean searchDFD(Node root, int value){
        if(root == null) return false;

        if(root.data == value) return true;

        boolean leftRes = searchDFD(root.left, value);
        boolean rightRes = searchDFD(root.right, value);

        return leftRes || rightRes;
    }
}