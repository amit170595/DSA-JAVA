import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    float wt;
    float profit;
    float pw;

    Product(float w, float p) {
        wt = w;
        profit = p;
        pw = p / w;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            float cap = sc.nextFloat();
            float wt[] = new float[n];
            float profit[] = new float[n];
            Product ratio[] = new Product[n];
            for (int i = 0; i < n; i++)
                wt[i] = sc.nextFloat();
            for (int i = 0; i < n; i++)
                profit[i] = sc.nextFloat();
            for (int i = 0; i < n; i++)
                ratio[i] = new Product(wt[i], profit[i]);
            functionalKnapsack(ratio, cap, n);
        }
    }

    private static void functionalKnapsack(Product[] ratio, float cap, int n) {
        Arrays.sort(ratio, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.pw < o2.pw)
                    return -1;
                else if (o1.pw > o2.pw)
                    return 1;
                else
                    return 0;
            }
        });
        int flag = 0;
        float totalProfit = 0;
        int i = 0;
        for (i = n - 1; i >= 0; i--) {
            float currWt = ratio[i].wt;
            float currPro = ratio[i].profit;
            if (cap > 0 && currWt <= cap) {
                cap = cap - currWt;
                totalProfit += currPro;
            } else {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            totalProfit += ratio[i].profit * (cap / ratio[i].wt);
        }
        System.out.println(totalProfit);
    }
}
