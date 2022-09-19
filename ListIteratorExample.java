import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            ll.add(i);
        }
        System.out.println(ll);
        ListIterator<Integer> list = ll.listIterator();
        while (list.hasNext()) {
            int index = list.nextIndex();
            int i = list.next();
            System.out.println("Element at index " + index + " is " + i);
        }
        System.out.println(list.nextIndex());
        while (list.hasPrevious()) {
            int prevIndex = list.previousIndex();
            int prev = list.previous();
            System.out.println(prevIndex + " " + prev);
        }
        System.out.println(list.previousIndex());
        list.set(10);
        System.out.println(ll);
    }
}
