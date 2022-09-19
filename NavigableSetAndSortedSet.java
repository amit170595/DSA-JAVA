import java.util.TreeSet;

class NavigableSetAndSortedSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 8; i++)
            treeSet.add(i);
        System.out.println(treeSet);

        // SortedSet Example
        System.out.println("First(): " + treeSet.first());
        System.out.println("Last(): " + treeSet.last());
        System.out.println("headSet(): " + treeSet.headSet(4));
        System.out.println("TailSet(): " + treeSet.tailSet(4));
        System.out.println("SubSet(): " + treeSet.subSet(3, 7));

        // NavigableSet Example
        System.out.println("Lower(): " + treeSet.lower(6));
        System.out.println("Floor(): " + treeSet.floor(8));
        System.out.println("Ceiling(): " + treeSet.ceiling(5));
        System.out.println("Higher(): " + treeSet.higher(6));
        System.out.println("PollFirst(): " + treeSet.pollFirst());
        System.out.println("After PollFirst: " + treeSet);
        System.out.println("PollLast(): "+ treeSet.pollLast());
        System.out.println("After PollLast: "+ treeSet);
    }
}
