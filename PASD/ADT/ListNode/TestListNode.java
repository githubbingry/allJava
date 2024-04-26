package PASD.ADT.ListNode;

public class TestListNode {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        
        li.head = new ListNode(9);
        li.append(7);
        li.append(6);
        li.append(node1);
        li.append(node2);
        li.append(node3);
        // li.insertFirst(new ListNode(100));
        // li.insertFirst(20);
        // li.insertAt(0, new ListNode(99));
        // li.insertAt(7, new ListNode(69));
        // li.insertAt(10, 8);

        //sama seperti insertFirst
        li.insertAt(0, 0);
        li.insertAt(-100, -100);
        
        //sama seperti append
        li.insertAt(100, 100);
        li.insertAt(li.getSize(), 42);
        
        //this works well!
        li.insertAt(7, 7);
        li.insertAt(9, 9);
        li.insertAt(3, 123);

        System.out.println(li.toString());

        li.deleteFirst();
        li.deleteLast();
        li.setAt(6, 42069);
        li.setAt(7, new ListNode(99));

        System.out.println(li.toString());

        li.setLast(new ListNode(44));
        li.deleteAt(4);
        li.insertAt(9, 0);

        System.out.println(li.toString());
        System.out.println(li.getLast());
        System.out.println(li.getSize());

        if(!testingInstanceOf(li)){
            System.out.println("benar");
        } else {
            System.out.println("udin");
        }
    }

    static boolean testingInstanceOf(Object o){
        return o instanceof LinkedList;
    }
}
