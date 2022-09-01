public class DoublyLinkedList {
    Node head = null;

    void InsertBeg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void InsertEng(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null)
            tempNode = tempNode.next;
        tempNode.next = newNode;
        newNode.prev = tempNode;
    }

    void InsertAfter(int num, int data) {
        Node tempNode = head;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        while (tempNode != null && tempNode.data != num)
            tempNode = tempNode.next;
        newNode.next = tempNode.next;
        if (newNode.next != null)
            tempNode.next.prev = newNode;
        tempNode.next = newNode;
        newNode.prev = tempNode;
    }

    void DllDelete(int num) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node delNode = head;
        while (delNode != null && delNode.data != num)
            delNode = delNode.next;
        if (delNode == head) {
            head = head.next;
            head.prev = null;
            return;
        }
        delNode.prev.next = delNode.next;
        if (delNode.next != null)
            delNode.next.prev = delNode.prev;
    }

    void DllReverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null)
            head = temp.prev;
    }

    void PrintDllList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
