import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=1;i<10;i++)
            arr.add(i);
        System.out.println(arr);
        Iterator<Integer> iterator= arr.iterator();
        System.out.println(iterator.getClass().getName());
        while(iterator.hasNext()){
            int i= iterator.next();
            if(i%2!=0)
                System.out.print(i+" ");
            else
                iterator.remove();
        }
        System.out.println();
        System.out.println(arr);
    }
}
