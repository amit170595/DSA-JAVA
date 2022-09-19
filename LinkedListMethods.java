public class LinkedListMethods {
    Node head = null;

    void InsertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node tempNode = head;
            while (tempNode.next != null)
                tempNode = tempNode.next;
            tempNode.next = newNode;
        }
    }

    void Insert(int num, int data) {
        Node tempNode = head;
        while (tempNode != null && tempNode.data != num)
            tempNode = tempNode.next;
        Node newNode = new Node(data);
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    void Reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    void Delete(int num) {
        Node tempNode = head;
        while (tempNode != null && tempNode.data != num)
            tempNode = tempNode.next;
        if (tempNode == head) {
            if (head == null) {
                System.out.println("List is Empty");
                return;
            }
            head = head.next;
            return;
        }
    }

    void DeleteAtMid(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;
    }

    // void DeleteAtMid(int num) {
    // Node currentNode = head;
    // Node prevNode = null;
    // if (currentNode != null && currentNode.data == num) {
    // prevNode = currentNode;
    // currentNode = currentNode.next;
    // }
    // if (currentNode == head) {
    // if (head == null) {
    // System.out.println("List is Empty");
    // return;
    // }
    // head = head.next;
    // return;
    // }
    // prevNode.next = currentNode.next;
    // }

    void PrintList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
