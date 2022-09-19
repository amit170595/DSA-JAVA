import java.util.Comparator;
import java.util.TreeMap;

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

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();
        map.put(1, "Tony");
        map.put(4, "Steve");
        map.put(2, "Thor");
        map.put(5, "Bruce");
        map.put(3, "BlackPanther");
        map.put(6, "Falcon");
        System.out.println(map.put(6, "Falcon"));
        System.out.println(map);
        System.out.println("\n");

        TreeMap<Integer,String> map1= new TreeMap<>(new MyComparator());
        map1.put(1, "Tony");
        map1.put(4, "Steve");
        map1.put(2, "Thor");
        map1.put(5, "Bruce");
        map1.put(3, "BlackPanther");
        map1.put(6, "Falcon");
        System.out.println(map1);
    }
}
