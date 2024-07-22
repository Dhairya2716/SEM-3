public class SingleLL{
    Node head; 

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            }
             else {
                head = head.next;
            }
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            } 
            else {
                Node temp = head;
                Node prev = null;
                while(temp.next!= null){
                    prev = temp;
                    temp = temp.next;
                    }
                    prev.next = null;
            }
    }

    public void printnode(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.insertFirst(10); 
        list.insertFirst(18);
        list.insertLast(189);
        // list.deleteFirst();
        list.deleteLast();
        list.printnode();
    }
}