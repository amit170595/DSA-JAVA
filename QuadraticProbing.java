import java.util.Scanner;

class QHashSlot {
    int key;
    int value;

    QHashSlot(int k, int v) {
        key = k;
        value = k;
    }
}
class QHashTableSlot {
    private int size, TableSize;
    private QHashSlot[] table;

    public QHashTableSlot(int capacity) {
        size = 0;
        TableSize = capacity;
        table = new QHashSlot[TableSize];
        for (int i = 0; i < TableSize; i++) {
            table[i] = null;
        }
    }

    int getSize() {
        return size;
    }

    void Clear() {
        for (int i = 0; i < TableSize; i++)
            table[i] = null;
        size = 0;
    }

    void insert(int key, int value) {
        int index = key % TableSize;
        int i = index;
        int p=1;
        do {
            if (table[i] == null) {
                table[i] = new QHashSlot(key, value);
                size++;
                return;
            }
            if (table[i].key == key) {
                System.out.println("Duplicate key are not allowed");
                return;
            }
            i = (index+(p*p)) % TableSize;
            p++;
        } while (i != index);
        System.out.println("HashTable is Full");
    }

    boolean SearchElement(int key) {
        int index = key % TableSize;
        int i = index;
        int p=1;
        do {
            if (table[i] == null)
                return false;
            if (table[i].key == key)
                return true;
            i = (index+(p*p)) % TableSize;
            p++;
        } while (i != index);
        return false;
    }

    void Display() {
        for (int i = 0; i < TableSize; i++) {
            if (table[i] == null)
                System.out.println("HashTable[" + i + "] has no element");
            else{
                System.out.println("HashTable[" + i + "] has element");
                System.out.println("Key=" + table[i].key + " and value=" + table[i].value);
            }
        }
    }
}

public class QuadraticProbing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            QHashTableSlot ht = new QHashTableSlot(n);
            for (int i = 0; i < 8; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                ht.insert(key, value);
            }
            ht.Display();
            if (ht.SearchElement(25))
                System.out.println("key 25 is present");
            else
                System.out.println("key 25 is not present");
            System.out.println(ht.getSize());
            ht.Clear();
            System.out.println(ht.getSize());
        }
    }
}
