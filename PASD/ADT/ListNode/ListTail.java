package PASD.ADT.ListNode;

public class ListTail {
    ListNode head;
    ListNode tail;
    private int size;

    public ListTail() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize(){ return this.size; }
}
