import java.util.Scanner;

class LinkedHash {
    int key;
    int value;
    LinkedHash next;

    LinkedHash(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class HashTable {
    private int TableSize;
    private int size;
    private LinkedHash[] table;

    public HashTable(int capacity) {
        size = 0;
        TableSize = capacity;
        table = new LinkedHash[TableSize];
        for (int i = 0; i < TableSize; i++)
            table[i] = null;
    }

    public int getSize() {
        return size;
    }

    public void Clear() {
        for (int i = 0; i < TableSize; i++)
            table[i] = null;
        size = 0;
    }

    public int getValue(int key) {
        int hash = (key % TableSize);
        if (table[hash] == null)
            return -1;
        else {
            LinkedHash entry = table[hash];
            while (entry != null && !(entry.key == key))
                entry = entry.next;
            if (entry == null)
                return -1;
            else
                return entry.value;
        }
    }

    public void insert(int key, int value) {
        int hash = (key % TableSize);
        if (table[hash] == null)
            table[hash] = new LinkedHash(key, value);
        else {
            LinkedHash entry = table[hash];
            while (entry.next != null && !(entry.key == key))
                entry = entry.next;
            if (entry.key == key)
                entry.value = value;
            else
                entry.next = new LinkedHash(key, value);
        }
        size++;
    }

    void PrintHashTable() {
        for (int i = 0; i < TableSize; i++) {
            System.out.print("\nBucket " + (i + 1)+": ");
            LinkedHash entry = table[i];
            while (entry != null) {
                System.out.print("{Key=" + entry.key + " Value=" + entry.value + "}");
                entry = entry.next;
            }
        }
    }
}

public class DirectChainingHashing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            HashTable ht = new HashTable(n);
            for (int i = 0; i < n; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                ht.insert(key, value);
            }
            ht.PrintHashTable();
            System.out.println(ht.getValue(1000));
            System.out.println(ht.getSize());
            ht.Clear();
            System.out.println(ht.getSize());
        }
    }
}