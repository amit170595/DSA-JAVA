import java.util.Comparator;
import java.util.TreeSet;


class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2)
            return 1;
        else if(o1>o2)
            return -1;
        else
            return 0;
    }
    
}

public class TreeSetAndComparableInterface {
    public static void main(String[] args) {

        //TreeSet Example
        TreeSet<Character> treeSet= new TreeSet<>();
        treeSet.add('a');
        treeSet.add('b');
        treeSet.add('d');
        treeSet.add('Z');
        treeSet.add('c');
        treeSet.add('z');
        System.out.println(treeSet.add('z'));
        System.out.println(treeSet);
        System.out.println("\n");

        //Comparable Interface Example
        System.out.println("A".compareTo("B"));
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("B"));
        System.out.println("C".compareTo("C"));
        System.out.println("\n");

        TreeSet<Integer> treeSet1= new TreeSet<>(new MyComparator());
        treeSet1.add(1);
        treeSet1.add(5);
        treeSet1.add(3);
        treeSet1.add(4);
        treeSet1.add(2);
        System.out.println(treeSet1);
    }
}
