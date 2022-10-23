import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Pairs2 {
    int x;
    int y;

    Pairs2(int i, int j) {
        x = i;
        y = j;
    }
}

public class ActivitySelectionProblem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int start[] = new int[n];
                int finish[] = new int[n];
                for (int i = 0; i < n; i++)
                    start[i] = sc.nextInt();
                for (int i = 0; i < n; i++)
                    finish[i] = sc.nextInt();
                ArrayList<Pairs2> arr = new ArrayList<>();
                for (int i = 0; i < n; i++)
                    arr.add(new Pairs2(start[i], finish[i]));
                ActivitySeletion(arr, n);
            }
        }
    }

    private static void ActivitySeletion(ArrayList<Pairs2> arr, int n) {
        arr.sort(new Comparator<Pairs2>() {
            @Override
            public int compare(Pairs2 o1, Pairs2 o2) {
                return o1.y - o2.y;
            }
        });
        ArrayList<Integer> selected = new ArrayList<>();
        int i = 0;
        selected.add(i);
        for (int j = 1; j < n; j++) {
            if (arr.get(j).x > arr.get(i).y) {
                selected.add(j);
                i = j;
            }
        }
        for (i = 0; i < selected.size(); i++) {
            System.out.print(selected.get(i) + " ");
        }
        System.out.println();
    }
}
