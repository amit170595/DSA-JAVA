import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;
    public Producer(ArrayBlockingQueue<Integer> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
                queue.put(BlockingQueueExample.counter++);
                System.out.println("Value added in queue: "+BlockingQueueExample.counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;
    public Consumer(ArrayBlockingQueue<Integer> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000);
                queue.take();
                BlockingQueueExample.counter--;
                System.out.println("Value removed in queue: "+BlockingQueueExample.counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BlockingQueueExample {
    static int counter=0;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue= new ArrayBlockingQueue<>(10);
        Producer produce= new Producer(queue);
        Thread producerThread= new Thread(produce);
        producerThread.start();
        Consumer consume= new Consumer(queue);
        Thread consumerThread= new Thread(consume);
        consumerThread.start();
    }
}
