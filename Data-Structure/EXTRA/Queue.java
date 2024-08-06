public class Queue {
    private int[] arr;
    private int rear = -1;

    public Queue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void enqueue(int data) {
        if (rear == arr.length - 1) {
            throw new RuntimeException("Queue is full");
        }
        rear++;
        arr[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[0];
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.dequeue();
        }
    }
}