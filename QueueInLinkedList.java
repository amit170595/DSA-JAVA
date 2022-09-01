class ListQueue {
    Node front = null;
    Node rear = null;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == rear) {
            rear = front = newNode;
            return;
        }
        rear.next = newNode;
        rear = rear.next;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }
}

public class QueueInLinkedList {
    public static void main(String[] args) {
        ListQueue queue = new ListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        int data = queue.dequeue();
        System.out.println(data);
    }
}