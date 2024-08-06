
public class varun {
    class Node{
        int data ;
        Node info;

        Node(int data){
            this.data = data;
            this.info = null;
        }
    }

    public Node First = null;

    public void InsertAtFirst(int data){
        Node Newnode = new Node(data);
        if(First == null){
            First = Newnode;
            return;
        }
        else{
            Node temp = First;
            First = Newnode;
            First.info = temp;
        }
        
    }

    public void InsertAtLast(int data){
        Node Newnode = new Node(data);
        if(First == null){
            First = Newnode;
            return;
        }
        else{
            Node last = First;
            while(last.info != null){
                last = last.info;
            }
            last.info = Newnode;
        }
    }

    public void InsertInOrder(int data){
        Node Newnode = new Node(data);
        if(First == null || Newnode.data <= First.data){
            Newnode.info = First;
            First = Newnode;
            return;
        }
        else{
            Node current = First;
            while(current.info != null && Newnode.data >= current.info.data){
                current = current.info;
            }
            Newnode.info = current.info;
            current.info = Newnode;
        }
    }

    public void DeleteAtFirst(){
        if(First == null){
            System.out.println("Empty");
        }
        else{
            First = First.info;
        }
    }
    public void DeleteAtLast(){
        if(First == null){
            System.out.println("Empty");
        }
        else{
            Node temp = First;
            Node prev = null;
           while(temp.info != null){
            prev = temp;
            temp = temp.info;
           }
           prev.info = null;
        }
    }

    public void DeleteInOrder(int x){
        if(First == null){
            System.out.println("Empty");
            return;
        }
        Node temp = First; 
        Node prev = null;
            if(temp.data == x){
               First = temp.info;
               return; 
            }
            while(temp != null && temp.data != x){
                prev = temp;
                temp = temp.info;
            }

            if(temp == null){
                System.out.println("Node not found");
                return;
            }

            prev.info = temp.info;
    }

    public void displaynode(){
        Node temp = First;
        int count = 0;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.info;
            count++;
        }
        System.out.println("null");
        System.out.println("Count is "+count);
    }
    public static void main(String[] args) {
        varun list = new varun();
        list.InsertAtFirst(15);
        list.InsertAtLast(88);
        list.InsertInOrder(50);
        // list.DeleteInOrder(88);
        // list.DeleteAtFirst();
        list.DeleteAtLast();
        list.displaynode();
    }
}