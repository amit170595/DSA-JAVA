import java.util.Scanner;

class HashSlot {
    int key;
    int value;

    HashSlot(int k, int v) {
        key = k;
        value = k;
    }
}

class HashTableSlot {
    private int size, TableSize;
    private HashSlot[] table;

    public HashTableSlot(int capacity) {
        size = 0;
        TableSize = capacity;
        table = new HashSlot[TableSize];
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
        do {
            if (table[i] == null) {
                table[i] = new HashSlot(key, value);
                size++;
                return;
            }
            if (table[i].key == key) {
                System.out.println("Duplicate key are not allowed");
                return;
            }
            i = (i + 1) % TableSize;
        } while (i != index);
        System.out.println("HashTable is Full");
    }

    boolean SearchElement(int key) {
        int index = key % TableSize;
        int i = index;
        do {
            if (table[i] == null)
                return false;
            if (table[i].key == key)
                return true;
            i = (i + 1) % TableSize;
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

public class LinearProbing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            HashTableSlot ht = new HashTableSlot(n);
            for (int i = 0; i < 6; i++) {
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
