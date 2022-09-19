import java.util.HashMap;
import java.util.IdentityHashMap;

public class IndentityHashMapExample {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(i1, "Goku");
        System.out.println(map1);
        map1.put(i2, "Gohan");
        System.out.println(map1);
        IdentityHashMap<Integer, String> map2 = new IdentityHashMap<>();
        map2.put(i1, "Goku");
        System.out.println(map2);
        map2.put(i2, "Gohan");
        System.out.println(map2);
    }
}