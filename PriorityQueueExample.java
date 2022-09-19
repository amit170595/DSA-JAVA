import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Loki");
        queue.add("MoonKnight");
        queue.add("SheHulk");
        queue.add("WandaVision");
        queue.add("IronMan");
        queue.add("BlackPanther");
        System.out.println(queue);
        System.out.println("Head= "+ queue.peek());
        System.out.println("Head= "+ queue.poll());
        System.out.println("After poll(): "+ queue);
        Iterator<String> itr= queue.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();
        System.out.println("Head= "+ queue.peek());
        queue.poll();
        System.out.println("New Head= "+ queue.peek());
        System.out.println("Is Loki present in Queue: "+ queue.contains("Loki"));
        System.out.println(queue);
        queue.remove("SheHulk");
        System.out.println(queue);
    }
}
