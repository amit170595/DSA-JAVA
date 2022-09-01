public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.InsertBeg(1);
        dll.PrintDllList();
        dll.InsertEng(2);
        dll.InsertEng(3);
        dll.InsertEng(5);
        dll.PrintDllList();
        dll.InsertAfter(3, 4);
        dll.InsertAfter(4, 8);
        dll.PrintDllList();
        dll.DllDelete(8);
        dll.PrintDllList();
        dll.DllReverse();
        dll.PrintDllList();
    }
}
