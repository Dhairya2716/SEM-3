class LL{
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null; 
            size++;               
        }
    }

    // add - first

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add - last

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node CurrentNode = head;
        if(CurrentNode.next != null){
            CurrentNode = CurrentNode.next;
        }
        CurrentNode.next = newNode;
    }

    // to print

    public void printList(){
        if(head == null){
            System.out.println("The list is empty Sorry!");
            return;
        }
        Node CurrentNode = head;
        while(CurrentNode != null){
            System.out.print(CurrentNode.data + " -> ");
            CurrentNode = CurrentNode.next;
        }
        System.out.println("NULL");
    }

        // delete first 

    public void deleteFirst(){
        if(head == null){
            System.out.println("String is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last 

    public void deletelast(){
        if(head == null){
            System.out.println("This list is empty");
            return;
        }

        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node Secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            Secondlast = Secondlast.next;
        }
        Secondlast.next = null;
    }

    // size 

    public int getsize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("2");
        list.printList();
        
        System.out.println(list.getsize());
    }
}