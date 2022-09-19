public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListMethods list = new LinkedListMethods();
        list.InsertAtBeg(5);
        list.PrintList();
        list.InsertAtEnd(6);
        list.InsertAtEnd(7);
        list.InsertAtEnd(8);
        list.InsertAtEnd(9);
        list.PrintList();
        list.Insert(7, 10);
        list.PrintList();
        list.Delete(5);
        list.PrintList();
        list.DeleteAtMid(10);
        list.PrintList();
        list.Reverse();
        list.PrintList();
    }
}
