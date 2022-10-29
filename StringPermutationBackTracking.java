import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringPermutationBackTracking {
    static ArrayList<String> ans;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                ans = new ArrayList<>();
                String s = sc.next();
                int n = s.length();
                Permutation(s, n, 0);
                Collections.sort(ans);
                for (String ele : ans) {
                    System.out.println(ele);
                }
            }
        }
    }

    private static void Permutation(String s, int n, int i) {
        if (i == n - 1) {
            ans.add(s);
            return;
        }
        for (int j = i; j < n; j++) {
            s = Swap(s, i, j);
            Permutation(s, n, i + 1);
            s = Swap(s, i, j);

        }
    }

    private static String Swap(String s, int i, int j) {
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(i, s.charAt(j));
        sb.setCharAt(j, s.charAt(i));
        return sb.toString();
    }
}
