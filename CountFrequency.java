
import java.util.*;

public class CountFrequency {

    static int MAX_CHAR = 26;

    static class Trie {
        public int cnt;

        public Trie node[] = new Trie[MAX_CHAR];

        public Trie() {
            for (int i = 0; i < MAX_CHAR; i++)
                node[i] = null;
            cnt = 0;
        }
    }

    static Trie insert(Trie root, String s) {
        Trie temp = root;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int index = (int) s.charAt(i) - (int) 'a';
            if (root.node[index] == null)
                root.node[index] = new Trie();
            root = root.node[index];
        }
        root.cnt++;
        return temp;
    }

    static int search(Trie root, String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int index = (int) s.charAt(i) - (int) 'a';
            if (root.node[index] == null)
                return 0;
            root = root.node[index];
        }
        return root.cnt;
    }

    static void answerQueries(String arr[], int n, String q[], int m) {
        Trie root = new Trie();
        for (int i = 0; i < n; i++)
            root = insert(root, arr[i]);
        for (int i = 0; i < m; i++)
            System.out.println(search(root, q[i]));

    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String str[] = new String[n];
            for (int i = 0; i < n; i++)
                str[i] = sc.next();
            int m = sc.nextInt();
            String str1[] = new String[m];
            for (int i = 0; i < m; i++)
                str1[i] = sc.next();
            answerQueries(str, n, str1, m);
        }
    }
}