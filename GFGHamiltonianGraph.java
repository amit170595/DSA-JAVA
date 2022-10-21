import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GFGHamiltonianGraph {
    int n;

    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edge) {
        n = N;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (ArrayList<Integer> edge : Edge) {
            int src = edge.get(0);
            int des = edge.get(1);
            map.putIfAbsent(src, new ArrayList<>());
            map.putIfAbsent(des, new ArrayList<>());
            map.get(src).add(des);
            map.get(des).add(src);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int node = 1; node <= N; node++) {
            if (dfs(node, set, map)) {
                return true;
            }
        }
        return false;
    }

    boolean dfs(int curr, HashSet<Integer> set, HashMap<Integer, ArrayList<Integer>> map) {
        set.add(curr);
        if (set.size() == n) {
            return true;
        }
        for (int neb : map.get(curr)) {
            if (!set.contains(neb) && dfs(neb, set, map)) {
                return true;
            }
        }
        set.remove(curr);
        return false;
    }
}
