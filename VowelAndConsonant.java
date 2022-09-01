import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                int i, v = 0, c = 0;
                char ch;
                int n = s.length();
                for (i = 0; i < n; i++) {
                    ch = s.charAt(i);
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        v++;
                    } else {
                        c++;
                    }
                }
                System.out.println(v + " " + c);
            }
        }

    }
}
