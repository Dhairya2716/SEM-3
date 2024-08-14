public class Circularqueue {
    private int[] arr;
    private int rear = -1;

    public Circularqueue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void cirenqueue(int data){
        if(rear == arr.length-1){
            System.out.println("Queue is full");
            return;
        }
        else{
            rear++;
            arr[rear] = data;
            System.out.println(data + " is added to the queue");
        }
    }

    public void cirdequeue(){
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        else{
            int temp = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
                }
                rear--;
                System.out.println(temp + " is removed from the queue");
        }
    }
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[0];
    }
    public static void main(String[] args){
        Circularqueue q = new Circularqueue(5);
        q.cirenqueue(1);
        q.cirenqueue(15);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.cirdequeue();
        }
    }
}