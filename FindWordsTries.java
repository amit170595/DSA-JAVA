import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindWordsTries {

    static boolean match_words(String dictionary[], String sentence[], int n, int m) {
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(dictionary[i]))
                mp.put(dictionary[i], mp.get(dictionary[i]) + 1);
            else
                mp.put(dictionary[i], 1);
        }
        for (int i = 0; i < m; i++) {
            if (mp.containsKey(sentence[i]))
                mp.put(sentence[i], mp.get(sentence[i]) - 1);
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                String str1[] = new String[n];
                for (int i = 0; i < n; i++)
                    str1[i] = sc.next();
                String str2[] = new String[m];
                for (int i = 0; i < m; i++)
                    str1[i] = sc.next();
                if (match_words(str1, str2, n, m))
                    System.out.println("Present");
                else
                    System.out.println("Not");
            }
        }
    }
}