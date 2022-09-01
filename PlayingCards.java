import java.util.Scanner;

public class PlayingCards {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String target = sc.next();
                char ch = target.charAt(0);
                char ch1 = target.charAt(1);
                String cards[] = new String[5];
                int i = 0, flag = 0;
                for (i = 0; i < 5; i++) {
                    cards[i] = sc.next();
                    if (cards[i].charAt(0) == ch || cards[i].charAt(1) == ch1) {
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}