import java.util.Scanner;

public class DublicateCharecter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String st = sc.next();
                int freq[] = new int[26];
                int i, flag = 0;
                for (i = 0; i < st.length(); i++) {
                    freq[st.charAt(i) - 97]++;
                }
                for (i = 0; i < 26; i++) {
                    if (freq[i] >= 2) {
                        flag = 1;
                        System.out.print((char) (i + 97) + "=" + freq[i] + " ");
                    }
                }
                if (flag == 0)
                    System.out.println("-1");
                System.out.println();
            }
        }
    }
}