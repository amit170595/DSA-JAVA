import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < n; i++)
            arrlist.add(i);
        System.out.println(arrlist);
        arrlist.remove(2);
        System.out.println("After remove 2: " + arrlist);
        arrlist.add(2, 10);
        System.out.println("After add 10 in index 2 is: " + arrlist);
        arrlist.add(1, 4);
        System.out.println("After add 4, the ArrayList is: " + arrlist);
        System.out.println("First index of 4 is: " + arrlist.indexOf(4));
        System.out.println("Last index of 4 is: " + arrlist.lastIndexOf(4));
        System.out.println("Element of the index 4 is: " + arrlist.get(4));
        System.out.println("ArrayList is Empty: " + arrlist.isEmpty());
        System.out.println("Size of ArrayList is: " + arrlist.size());
        System.out.println("If 10 is present in ArrayList: " + arrlist.contains(10));
        arrlist.add(2, 17);
        System.out.println(arrlist);
    }
}
