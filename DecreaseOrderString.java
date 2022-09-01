import java.util.Scanner;

public class DecreaseOrderString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String st = sc.next();
                int i, j;
                char a[] = st.toCharArray();
                char temp;
                for (i = 0; i < a.length; i++) {
                    for (j = i + 1; j < a.length; j++) {
                        if (a[i] < a[j]) {
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
                System.out.println(a);
            }
        }
    }
}
