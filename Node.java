public class Node {
    int data;
    Node next;
    Node right;
    Node prev;
    Node left; // for Doubly Linked List

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null; // for Double Linked List
        this.left = null;
        this.right = null;
    }
}
