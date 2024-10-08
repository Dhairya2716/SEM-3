class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Preorder {
    static void preorderTraversal(Node node) {
        if (node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
    root.left = new Node(25);
    root.left.left = new Node(22);
    root.left.left.left = new Node(15);
    root.left.right = new Node(40);
    root.left.right.left = new Node(30);
    root.right = new Node(75);
    root.right.left = new Node(60);
    root.right.right = new Node(80);
    root.right.right.right = new Node(90);
        preorderTraversal(root);
    }
}
