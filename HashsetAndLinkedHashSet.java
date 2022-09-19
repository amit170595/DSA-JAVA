import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetAndLinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("Delhi");
        hashSet.add("Pune");
        hashSet.add("Mumbai");
        hashSet.add("Agra");
        hashSet.add("Kolkata");
        hashSet.add("Assam");
        System.out.println(hashSet);
        System.out.println(hashSet.add("Delhi"));
        System.out.println(hashSet);
        System.out.println("HashSet contains Pune is: "+ hashSet.contains("Pune"));
        hashSet.remove("Agra");
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet.isEmpty());

        //LinkedHashSet Example
        LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add("Delhi");
        linkedHashSet.add("Pune");
        linkedHashSet.add("Mumbai");
        linkedHashSet.add("Agra");
        linkedHashSet.add("Kolkata");
        linkedHashSet.add("Assam");
        System.out.println("LinkedHashSet: "+linkedHashSet);
    }
}
