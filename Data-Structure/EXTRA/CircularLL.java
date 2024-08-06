class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class CircularLL{

    Node first;
    Node last;

    public void InsertAtFirst(int data){
        Node NewNode = new Node(data);
        if(first == null){
            first = NewNode;
            last = NewNode;
            first.next = last;
            last.next = first;
        }
        else{
            NewNode.next = first;
            first = NewNode;
            last.next = first;
        }
    }

    public void InsertAtLast(int data){
        Node NewNode = new Node(data);
        if(first == null){
            first = NewNode;
            last = NewNode;
            first.next = last;
            last.next = first;
        }
        else{
            NewNode.next = first;
            last.next = NewNode;
            last = NewNode;
        }
    }

    public void InsertInOrder(int data){
        Node NewNode = new Node(data);
        if(first == null || first.data >= data){
            NewNode.next = first;
            first = NewNode;
            last.next = first;
        }
        else{
            Node temp = first;
            while(temp.next != first && temp.next.data <= data){
                temp = temp.next;
            }
            NewNode.next = temp.next;
            temp.next = NewNode;
        }
    }
    public void DeleteAtFirst(){
        if(first == null){
            System.out.println("List is Empty");
        }
        else if(first == last){
            first = null;
            last = null;
        }
        else{
            first = first.next;
            last.next = first;
        }
    }
    public void DeleteAtLast(){
        if (first == null) {
            System.out.println("List is empty");
        } else if (first == last) {
            first = null;
            last = null;
        } else {
            Node temp = first;
            while (temp.next!= last) {
                temp = temp.next;
            }
            last = temp;
            last.next = first;
        }
    }
    public void DeleteInOrder(int data){
        if (first == null) {
            System.out.println("List is empty");
        } else if (first == last) {
            first = null;
            last = null;
        }
        else{
            Node temp = first;
            while(temp.next != first && temp.next.data != data){
                temp = temp.next;
            }
            if(temp.next != first){
                temp.next = temp.next.next;
            }
            if(temp.next == first){
                last = temp;
            }
        }
    }

    public void display(){
        Node temp = first;
        while(true){
            System.out.print(temp.data+"->");
            temp = temp.next;
            if(temp == first){
                break;
            }
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.InsertAtFirst(1);
        list.InsertAtFirst(2);
        list.InsertAtLast(3);
        list.InsertAtLast(5);
        list.InsertInOrder(4);
        list.DeleteInOrder(3);
        // list.DeleteAtFirst();
        list.display();
    }
}