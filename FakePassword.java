import java.util.Scanner;

public class FakePassword {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String o = sc.next();
                String f = sc.next();
                String dup = f;
                int len = dup.length();
                char ch[] = dup.toCharArray();
                int j, i;
                for (j = 0; j < 2; j++) {
                    char temp = ch[0];
                    for (i = 0; i < ch.length - 1; i++) {
                        ch[i] = ch[i + 1];
                    }
                    ch[ch.length - 1] = temp;
                }
                String a = String.valueOf(ch);
                String b = "";
                b = b + dup.substring(len - 2, len) + dup.substring(0, len - 2);
                int flag = 0;
                if (o.equals(a)) {
                    flag = 1;
                    System.out.println("Yes");
                }
                if (o.equals(b)) {
                    flag = 1;
                    System.out.println("Yes");
                }
                if (flag == 0)
                    System.out.println("No");
            }
        }
    }
}
