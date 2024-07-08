import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    void deleteLastNode() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next!= null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            int count = 1;
            while (temp.next!= null && count < position - 1) {
                temp = temp.next;
                count++;
            }
            if (count == position - 1) {
                temp.next = temp.next.next;
            } else {
                System.out.println("Position out of range");
            }
        }
    }

    void displayNodes() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class A_57{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert at front");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete first node");
            System.out.println("4. Insert at end");
            System.out.println("5. Delete last node");
            System.out.println("6. Delete node at position");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at front: ");
                    int data = scanner.nextInt();
                    list.insertAtFront(data);
                    break;
                case 2:
                    list.displayNodes();
                    break;
                case 3:
                    list.deleteFirstNode();
                    break;
                case 4:
                    System.out.print("Enter data to insert at end: ");
                    data = scanner.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 5:
                    list.deleteLastNode();
                    break;
                case 6:
                    System.out.print("Enter position to delete node: ");
                    int position = scanner.nextInt();
                    list.deleteNodeAtPosition(position);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}