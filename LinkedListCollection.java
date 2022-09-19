import java.util.LinkedList;

public class LinkedListCollection {
   public static void main(String[] args) {
    LinkedList<Character> ll= new LinkedList<>();
    ll.add('A');
    ll.add('B');
    ll.add('C');
    ll.add('D');
    ll.add('E');
    System.out.println(ll);
    ll.remove(3);
    System.out.println(ll);
    System.out.println("Size of the LinkedList is: "+ ll.size());
    ll.add(3, 'Z');
    System.out.println(ll);
    ll.remove(ll.indexOf('C'));
    System.out.println(ll);
    System.out.println(ll.get(3));
    ll.addFirst('G');
    ll.addLast('H');
    System.out.println(ll);
    char c= ll.getFirst();
    char d= ll.getLast();
    System.out.println(c+" "+d);
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);
   } 
}
