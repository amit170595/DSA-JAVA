import java.util.Scanner;

public class LongestUnique1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String str = sc.next();
                int len = longestUniqueSubsttr(str);
                System.out.println(len);
            }
        }
    }

    public static int longestUniqueSubsttr(String str) {
        String test = "";
        int maxLength = -1;
        if (str.isEmpty()) {
            return 0;
        } else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current) + 1);
            }
            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);
        }
        return maxLength;
    }
}
