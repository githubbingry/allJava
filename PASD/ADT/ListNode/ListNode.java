package PASD.ADT.ListNode;

public class ListNode {
    private int value;
    private ListNode next;

    public ListNode() {
        this.value = 0;
        this.next = null;
    }

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return this.next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[value=" + value + "]";
    }
}
