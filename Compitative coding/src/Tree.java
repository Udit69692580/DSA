class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Tree {
    Node root;
    public Tree() {
        root = null;
    }

    void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    void inOrderTraversal(Node node){
        if(node == null) return;
        postOrderTraversal(node.left);
        System.out.print(node.data +" ");
        postOrderTraversal(node.right);
    }
    void postOrderTraversal(Node node){
        if(node == null) return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data +" ");

    }

    void preOrder() {
        preOrderTraversal(root);
    }
    void inOrder(){
        inOrderTraversal(root);
    }
    void postOrder(){
        postOrderTraversal(root);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.right = new Node(8);
        tree.root.right.right.right = new Node(9);

        System.out.println("Preorder traversal of the tree:");
        tree.preOrder();
        System.out.println();
        System.out.println("Inorder traversal of the tree");
        tree.inOrder();
        System.out.println();
        System.out.println("Postorder traversal of the tree:");
        tree.postOrder();
    }
}
