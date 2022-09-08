import java.util.Arrays;
import java.util.Scanner;

class Box implements Comparable<Box> {
    public int balls = -1;
    public int color = -1;

    public Box(int b, int c) {
        balls = b;
        color = c;
    }

    @Override
    public int compareTo(Box box) {
        if (box.balls > this.balls)
            return -1;
        else
            return 1;

    }

}

public class ChefAndMinimumColor {

    static int find_greater_than_x(int x, int arr[]) {
        // System.out.println("find "+ x + "in "+ Arrays.toString(arr));
        int len = arr.length;
        int l = 0, r = len - 1;
        int mid;
        int reply = Integer.MAX_VALUE;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] < x) {
                l = mid + 1;
            } else if (arr[mid] >= x) {
                r = mid - 1;
                reply = Math.min(reply, arr[mid]);
            }
        }
        if (reply == Integer.MAX_VALUE)
            reply = -1;
        return reply;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                Box boxes[] = new Box[n + 1];
                int col;
                for (int i = 1; i <= n; i++) {
                    if (i % m == 0)
                        col = m;
                    else
                        col = i % m;
                    boxes[i] = new Box(sc.nextInt(), col); // col -> 1 to m
                }

                int colors[][] = new int[m + 1][n / m + 1];
                int k;
                double rem = n % m;
                for (int i = 1; i <= m; i++) {
                    k = 0;
                    while (k * m + i <= n) {
                        colors[i][k] = boxes[k * m + i].balls;
                        k++;
                    }
                    if (rem != 0 && i > rem)
                        colors[i][n / m] = -1;
                    Arrays.sort(colors[i]);
                    // System.out.println(Arrays.toString(colors[i]));
                }
                Arrays.sort(boxes, 1, n + 1);
                int ans = Integer.MAX_VALUE, minimum_balls;
                int min_col;
                int maximum = Integer.MAX_VALUE;

                for (int i = 1; i <= n; i++) {
                    minimum_balls = boxes[i].balls;
                    min_col = boxes[i].color;
                    maximum = Integer.MIN_VALUE;
                    boolean flag = false;
                    // System.out.println("minimum "+minimum_balls);
                    for (int j = 1; j <= m; j++) {
                        if (j == min_col)
                            continue;
                        else {
                            int just_greater = find_greater_than_x(minimum_balls, colors[j]);
                            // System.out.println("just Greater "+just_greater);
                            if (just_greater == -1) {
                                flag = true;
                                break;
                            }
                            maximum = Math.max(maximum, just_greater);
                            if (maximum - minimum_balls > ans)
                                break;
                            // System.out.println("maximum "+maximum);
                        }
                    }
                    if (flag == true) {
                        break;
                    } else {
                        ans = Math.min(ans, maximum - minimum_balls);
                        // System.out.println("ans + "+ ans);
                    }
                }
                System.out.println(ans);
            }
        }

    }
}