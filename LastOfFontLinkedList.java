import java.util.Scanner;

public class LastOfFontLinkedList {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            MoveLast llist = new MoveLast();
            while (t-- > 0) {
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    int ele = sc.nextInt();
                    llist.push(ele);

                }
                // llist.push(5);
                // llist.push(4);
                // llist.push(3);
                // llist.push(2);
                // llist.push(1);
                llist.moveToFront();
                llist.printList();
            }
        }
    }
}

// class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

class MoveLast {
    Node head;

    void moveToFront() {
        if (head == null || head.next == null)
            return;

        /* Initialize second last and last pointers */
        Node secLast = null;
        Node last = head;

        while (last.next != null) {
            secLast = last;
            last = last.next;
        }

        secLast.next = null;
        last.next = head;
        head = last;
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
