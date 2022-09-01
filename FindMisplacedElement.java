import java.util.Scanner;

public class FindMisplacedElement {
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
                int arr[] = new int[n];
                int sorted[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    sorted[i] = arr[i];
                }
                mergeSort(sorted, 0, n - 1);
                int count = 0;
                for (int i = 0; i < n; i++)
                    if (arr[i] != sorted[i])
                        count++;
                System.out.println(count);
            }
        }

    }
}
