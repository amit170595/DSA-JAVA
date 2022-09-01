import java.util.Scanner;

public class HometownNewspaper {
    static void merge(int arr[], int start, int mid, int end) {
        int left[] = new int[mid - start + 1];
        int right[] = new int[end - mid];
        for (int i = start; i < mid + 1; i++) {
            left[i - start] = arr[i];
        }
        for (int i = mid + 1; i <= end; i++) {
            right[i - (mid + 1)] = arr[i];
        }
        int leftIndex = 0, rightIndex = 0, arrIndex = start;
        for (; leftIndex <= mid - start && rightIndex < end - mid; arrIndex++) {
            if (left[leftIndex] < right[rightIndex]) {
                arr[arrIndex] = left[leftIndex++];
            } else {
                arr[arrIndex] = right[rightIndex++];
            }
        }
        while (leftIndex <= mid - start) {
            arr[arrIndex++] = left[leftIndex++];
        }
        while (rightIndex < end - mid) {
            arr[arrIndex++] = right[rightIndex++];
        }

    }

    static void mergeSort(int arr[], int start, int end) {
        if (end == start)
            return;
        mergeSort(arr, start, (start + end) / 2);
        mergeSort(arr, ((start + end) / 2) + 1, end);
        merge(arr, start, (start + end) / 2, end);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            while (test-- != 0) {
                int n = sc.nextInt();
                String news[] = new String[n];
                int popularityAway[] = new int[99999];
                int popularityHome[] = new int[99999];
                int indexing[] = new int[999999];
                int home = 0, away = 0;
                for (int i = 0; i < n; i++) {
                    news[i] = sc.next();
                    int temp = sc.nextInt(), val = sc.nextInt();
                    if (val == 1)
                        popularityHome[home++] = temp;
                    else
                        popularityAway[away++] = temp;
                    indexing[temp] = i;
                }
                if (away > 0)
                    mergeSort(popularityAway, 0, away - 1);
                if (home > 0)
                    mergeSort(popularityHome, 0, home - 1);
                if (home > 0) {
                    for (int i = home - 1; i >= 0; i--)
                        System.out.println(news[indexing[popularityHome[i]]]);
                }
                if (away > 0) {
                    for (int i = away - 1; i >= 0; i--)
                        System.out.println(news[indexing[popularityAway[i]]]);
                }
            }
        }
    }
}
