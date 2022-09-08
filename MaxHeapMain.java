import java.util.Scanner;

class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    void Insert(int element) {
        Heap[++size] = element;
    }

    void BuildHeap() {
        int j = (int) Math.floor(size / 2.0);
        for (int i = j; i >= 1; i--)
            MaxHeapify(Heap, i);
    }

    private boolean IsLeaf(int pos) {
        if (pos > (size / 2) && pos <= size)
            return true;
        else
            return false;
    }

    private void MaxHeapify(int[] Heap, int i) {
        if (IsLeaf(i)) {
            return;
        }
        int leftChild = 2 * i;
        int rightChild = (2 * i) + 1;
        if (rightChild <= size) {
            if (Heap[i] >= Heap[leftChild] && Heap[i] >= Heap[rightChild])
                return;
        } else {
            if (Heap[i] >= Heap[leftChild])
                return;
        }
        int largest;
        if (leftChild <= size && Heap[leftChild] > Heap[i])
            largest = leftChild;
        else
            largest = i;
        if (rightChild <= size && Heap[rightChild] > Heap[largest])
            largest = rightChild;
        if (largest != i) {
            Swap(largest, i);
        }
        MaxHeapify(Heap, largest);
    }

    private void Swap(int largest, int i) {
        int temp;
        temp = Heap[largest];
        Heap[largest] = Heap[i];
        Heap[i] = temp;
    }

    void PrintHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(Heap[i] + " ");
        }
    }

    int ExtractMax() {
        if (size < 1)
            System.out.println("Error");
        int max = Heap[1];
        Heap[1] = Heap[size];
        size--;
        MaxHeapify(Heap, 1);
        return max;
    }

    void IncreaseKey(int i, int key) {
        if (key < Heap[i])
            return;
        Heap[i] = key;
        while (i > 1 && Heap[i / 2] < Heap[i]) {
            Swap(i, i / 2);
            i = i / 2;
        }
    }

    void HeapSort() {
        BuildHeap();
        int length = size;
        for (int i = size; i >= 2; i--) {
            Swap(1, i);
            size--;
            MaxHeapify(Heap, 1);
        }
        size = length;
    }
}

public class MaxHeapMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            MaxHeap maxheap = new MaxHeap(n);
            for (int i = 0; i < n; i++) {
                maxheap.Insert(sc.nextInt());
            }
            maxheap.BuildHeap();
            System.out.println("After Bulid Heap: ");
            maxheap.PrintHeap();
            System.out.println("delete element: " + maxheap.ExtractMax());
            maxheap.PrintHeap();
            System.out.println("\n");
            maxheap.HeapSort();
            maxheap.PrintHeap();
        }

    }

}
