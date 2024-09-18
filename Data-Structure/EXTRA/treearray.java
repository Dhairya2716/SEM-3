
class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class treearray {

    Node root;

    public treearray(int[] arr) {
        root = btarray(arr, 0);
    }

    public Node btarray(int[] arr, int i) {
        if (i >= arr.length) {
            return null;
        } else {
            Node temp = new Node(arr[i]);
            temp.left = btarray(arr, 2 * i + 1);
            temp.right = btarray(arr, 2 * i + 2);
            return temp;
        }
    }

    private void printpreorder(Node temp) {
        if (temp != null) {
            System.out.print(temp.data + " ");
            printpreorder(temp.left);
            printpreorder(temp.right);
        }
    }

    public void printpreorder() {
        printpreorder(root);
    }

    private void printinorder(Node temp) {
        if (temp != null) {
            printinorder(temp.left);
            System.out.print(temp.data + " ");
            printinorder(temp.right);
        }
    }

    public void printinorder() {
        printinorder(root);
    }

    private void printpostorder(Node temp) {
        if (temp != null) {
            printpostorder(temp.left);
            printpostorder(temp.right);
            System.out.print(temp.data + " ");
        }
    }

    public void printpostorder() {
        printpostorder(root);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 8, 3};
        treearray tree = new treearray(arr);
        tree.printpreorder();
        System.out.println(" ");
        tree.printinorder();
        System.out.println(" ");
        tree.printpostorder();
    }
}
