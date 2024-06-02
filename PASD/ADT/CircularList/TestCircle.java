package PASD.ADT.CircularList;

import PASD.ADT.ListNode.ListNode;

public class TestCircle {
    public static void main(String[] args) {
        MyCircularList m = new MyCircularList(10);
        m.insertFirst(new ListNode(90));
        m.insertFirst(new ListNode(420));
        m.insertFirst(new ListNode(79));
        m.cetak();
    }
}
