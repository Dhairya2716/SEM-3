public class DoubleLL{
    class Node{
        int info;
        Node LPTR;
        Node RPTR;

        Node(int data){
            this.info = data;
            this.LPTR = null;
            this.RPTR = null;
        }
        
    }
    Node first = null;
    Node L;
    Node R;

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            L = first;
            R = first;
        }
        else{
        newNode.RPTR = first;
        first.LPTR = newNode;
        first = newNode;
    }
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            L = first;
            R = first;
        }
        else{
        Node currNode = first;
        while (currNode.RPTR != null) {
            currNode = currNode.RPTR;
        }
        currNode.RPTR = newNode;
        newNode.LPTR = currNode;
        newNode = R;
    }
    }

    public void delete(int x){
        if (first == null) {
            System.out.println("Empty");
        }
        else{
            Node current = first;
            Node pred = null;
            while(current.RPTR != null && current.info != x){
                pred = current;
                current = current.RPTR;
            }
            pred.RPTR = current.RPTR;
            current.RPTR = current.LPTR;
            current.RPTR = current.LPTR = null;
            //current.Rptr =null;


        }
    }

    public void printList(){
        if (first == null) {
            System.out.println("Empty");
            return;
        }

        Node currNode = first;
        while (currNode != null) {
            System.out.print(currNode.info+"->");
            currNode = currNode.RPTR;
        }
        System.out.println("Null");
    }

    

    public static void main(String[] args) {
        DoubleLL dd = new DoubleLL();
        dd.insertFirst(10);
        dd.insertFirst(20);
        dd.insertLast(50);
        // dd.delete(10);
        dd.printList();
    }
}