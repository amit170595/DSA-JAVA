import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapAndHashMap {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();
        lhm.put(1, "Tony");
        lhm.put(4, "Steve");
        lhm.put(2, "Thor");
        lhm.put(5, "Bruce");
        lhm.put(3, "BlackPanther");
        lhm.put(6, "Falcon");
        System.out.println(lhm);

        HashMap<Integer,String> map= new HashMap<>();
        map.put(1, "Tony");
        map.put(4, "Steve");
        map.put(2, "Thor");
        map.put(5, "Bruce");
        map.put(3, "BlackPanther");
        map.put(6, "Falcon");
        System.out.println(map);
        System.out.println(map.put(4, "Captain"));
        System.out.println(map);
        map.remove(3);
        System.out.println(map);
        System.out.println(map.get(5));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Tony"));
        Set<Entry<Integer, String>> s1= map.entrySet();
        System.out.println(s1);
        Set<Integer> s2=map.keySet();
        System.out.println(s2);
        Iterator<Entry<Integer, String>> itr= s1.iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> m1= (Map.Entry<Integer, String>)itr.next();
            System.out.print(m1.getKey()+"="+m1.getValue()+" ");
            if(m1.getKey().equals(6)){
                m1.setValue("WarMachine");
            }
        }
        System.out.println();
        System.out.println(map);
    }
}
