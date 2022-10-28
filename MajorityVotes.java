import java.util.HashMap;
import java.util.Scanner;

public class MajorityVotes {
    public static void findWinner(int votes[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : votes) {
            if (map.keySet().contains(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        int maxValueInMap = 0;
        int winner = -1;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (val > maxValueInMap) {
                maxValueInMap = val;
                winner = key;
            } else if (val == maxValueInMap && winner == key)
                winner = key;
        }
        System.out.println(winner);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                findWinner(arr);
            }
        }
    }
}
