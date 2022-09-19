import java.util.TreeMap;

public class NavigableMapAndSortedMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Tony");
        map.put(4, "Steve");
        map.put(2, "Thor");
        map.put(5, "Bruce");
        map.put(3, "BlackPanther");
        map.put(6, "Falcon");
        System.out.println(map);
        // SortedMap Example
        System.out.println("FirstKey(): " + map.firstKey());
        System.out.println("LastKey(): " + map.lastKey());
        System.out.println("headMap(): " + map.headMap(4));
        System.out.println("TailMap(): " + map.tailMap(4));
        System.out.println("SubMap(): " + map.subMap(3, 7));

        // NavigableMap Example
        System.out.println("LowerKey(): " + map.lowerKey(6));
        System.out.println("FloorKey(): " + map.floorKey(8));
        System.out.println("CeilingKey(): " + map.ceilingKey(5));
        System.out.println("HigherKey(): " + map.higherKey(4));
    }
}