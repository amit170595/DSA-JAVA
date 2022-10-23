import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Items {
    int fv;
    int sv;
    int t;

    Items(int f, int s) {
        fv = f;
        sv = s;
        t = f + s;
    }
}

public class SortAccToBIts {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Items arr[] = new Items[n];
            int f, s;
            for (int i = 0; i < n; i++) {
                f = sc.nextInt();
                s = sc.nextInt();
                arr[i] = new Items(f, s);
            }
            Arrays.sort(arr, new Comparator<Items>() {
                @Override
                public int compare(Items o1, Items o2) {
                    if (o1.t == o2.t)
                        return o1.fv - o2.fv;
                    else
                        return o1.t - o2.t;
                }
            });
            for (int i = 0; i < n; i++)
                System.out.println(arr[i].fv + " + " + arr[i].sv + "= " + arr[i].t);
        }
    }
}
