package PASD.ADT.ListNode;

public class TestListTail {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList(10);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        l.append(n1);
        l.insertFirst(n2);
        l.append(n3);
        System.out.println(l.toString());

    }
}
