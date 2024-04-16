package PASD.ADT.ListNode;

public class TestListNode {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        
        li.head = new ListNode(7);
        li.append(7);
        li.append(6);
        li.append(node1);
        li.append(node2);
        li.append(node3);
        li.insertFirst(new ListNode(100));
        li.insertFirst(200);
        // li.insertAt(2, new ListNode(100));

        ListNode current = li.head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }

        System.out.println(li.toString());
    }
}
