
class Queueclass {
    private static int front;
    private static int rear;
    private static int capacity;
    private static int queue[];

    Queueclass(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    void Enqueue(int data) {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    int Dequeue() {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return -1;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
        return rear;
    }

    void Display() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (i = front; i < rear; i++) {
            System.out.printf("%d ", queue[i]);
        }
        return;
    }

    void queueFront() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }

    public boolean isEmpty() {
        return front == 0;    
    }
}

public class QueueInArray {
    public static void main(String[] args) {
        Queueclass q = new Queueclass(4);
        q.Display();
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.Display();
        q.Enqueue(60);
        q.Display();
        q.Dequeue();
        q.Dequeue();
        System.out.printf("\nafter two node deletion\n\n");
        q.Display();
        q.queueFront();
    }
}
