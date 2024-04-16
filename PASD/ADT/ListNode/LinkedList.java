package PASD.ADT.ListNode;

public class LinkedList {
    public ListNode head;
    // private int size; // optional

    public LinkedList() {
        this.head = null;
    }

    //O(1), insert first
    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        node.setNext(this.head);
        this.head = node;
    }
    
    public void insertFirst(ListNode node){
        node.setNext(this.head);
        this.head = node;
    }
    
    //O(n), inster last/append
    public void append(int value){
        ListNode node = new ListNode(value);
        if (this.head == null){
            this.head = node;
        } else {
            ListNode current = traverse();
            current.setNext(node);
        }
    }

    public void append(ListNode node){
        if (this.head == null){
            this.head = node;
        } else {
            ListNode current = traverse();
            current.setNext(node);
        }
    }

    //TODO : make method insert after dan insert at
    //O(n), insert after
    public void insertAfter(int value, ListNode prevNode){
        ListNode node = new ListNode(value);
        node.setNext(prevNode);
        prevNode = node;
    }

    //O(n), insert at index
    public void insertAt(int index, ListNode node){
        ListNode current = traverseWithIndex(index);
        node.setNext(current);
        current = node;
    }

    private ListNode traverse(){
        ListNode current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    private ListNode traverseWithIndex(int index){
        ListNode current = this.head;
        while (current.getNext() != null && index > 1) {
            current = current.getNext();
            index--;
        }
        return current;
    }

    @Override
    public String toString(){
        int i = 0;
        String text = ""+ i + this.head + " " ;
        ListNode current = this.head;
        while(current.getNext() != null){
            i++;
            current = current.getNext();
            text += ""+ i + current + " ";
        }
        return text;
    }
}
