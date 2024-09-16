
class Node {

    int data;
    Node lptr, rptr;

    public Node(int item) {
        data = item;
        lptr = rptr = null;
    }
}

public class bst {

    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data == data) {
            return root;
        }
        if (data < root.data) {
            root.lptr = insert(root.lptr, data);
        } else {
            root.rptr = insert(root.rptr, data);
        }

        return root;
    }

    static Node search(Node root, int data) {
        if (root == null || root.data == data) {
            return root;
        }
        if (root.data < data) {
            return search(root.rptr, data);
        } else {
            return search(root.lptr, data);
        }
    }

    static Node delete(Node root, int x) {
        if (root == null) {
            return root;
        }
        if (root.data > x) {
            root.lptr = delete(root.lptr, x);
        } else if (root.data < x) {
            root.rptr = delete(root.rptr, x);
        } else {
            if (root.lptr == null) {
                return root.rptr;
            }
            if (root.rptr == null) {
                return root.lptr;
            }
            Node temp = getSuccessor(root);
            root.data = temp.data;
            root.rptr = delete(root.rptr, temp.data);
        }
        return root;
    }

    static Node getSuccessor(Node temp) {
        temp = temp.rptr;
        while (temp != null && temp.lptr != null) {
            temp = temp.lptr;
        }
        return temp;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.lptr);
            System.out.print(root.data + " ");
            inorder(root.rptr);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        inorder(root);
        System.out.println(" ");
        System.out.println(search(root, 40) != null ? "Found" : "Not Found");

        System.out.println(" ");
        int x = 70;
        root = delete(root, x);
        inorder(root);
    }
}
