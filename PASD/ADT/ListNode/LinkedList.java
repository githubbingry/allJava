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
    
    //O(n), insert last/append
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

    //TODO : make method insert after
    //O(n), insert after?
    public void insertAfter(int value, ListNode prevNode){
        ListNode node = new ListNode(value);
        node.setNext(prevNode);
        prevNode = node;
    }

    //O(n), insert at index
    public void insertAt(int index, int value){
        ListNode node = new ListNode(value);
        int size = this.getSize();
        if (index == 0 || (index + size) < 0){ //untuk index awal atau nilai absolut dari index negatif yng lebih besar dari 0, (|index| > 0, index < 0)
            this.insertFirst(node);
        } else if (index >= size){ // out of bound/size dari linked list, append saja
            this.append(node);
        } else {
            if(index < 0) { //jika index negatif, maka mengakses linked list dari belakang
                index += size;
            }
            ListNode current = traverseWithIndex(index);
            ListNode prevNode = traverseWithIndex(index-1);
            node.setNext(current);
            prevNode.setNext(node);
        }
    }

    public void insertAt(int index, ListNode node){
        int size = this.getSize();
        if (index == 0 || (index + size) < 0){ //untuk index awal atau nilai absolut dari index negatif yng lebih besar dari 0, (|index| > 0, index < 0)
            this.insertFirst(node);
        } else if (index >= size){ // out of bound/size dari linked list, append saja
            this.append(node);
        } else {
            if(index < 0) { //jika index negatif, maka mengakses linked list dari belakang
                index += size;
            }
            ListNode current = traverseWithIndex(index);
            ListNode prevNode = traverseWithIndex(index-1);
            node.setNext(current);
            prevNode.setNext(node);
        }
    }

    //O(n), traverse (find and visit)
    private ListNode traverse(){
        ListNode current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    private ListNode traverseWithIndex(int index){
        ListNode current = this.head;
        while (current.getNext() != null && index > 0) {
            current = current.getNext();
            index--;
        }
        return current;
    }

    //getSize (1, 2, 3, ...)
    public int getSize(){
        ListNode current = this.head;
        int size = 1;
        while(current.getNext() != null){
            size++;
            current = current.getNext();
        }
        return size;
    }

    //TODO : buat method deleteAt, getFirst ,getLast, setFirst, setLast.
    //O(n), getAt index
    public ListNode getAt(int index){
        return traverseWithIndex(index);
    }

    //O(n), setAt index
    public void setAt(int index, int value){
        ListNode node = new ListNode(value);
        ListNode current = traverseWithIndex(index);
        node.setNext(current);
        current = node;
    }

    public void setAt(int index, ListNode node){
        ListNode current = traverseWithIndex(index);
        node.setNext(current);
        current = node;
    }

    //O(1), deleteFirst
    public void deleteFirst(){
        this.head = head.getNext();
    }
    
    //O(n), deleteLast
    public void deleteLast(){
        ListNode last = traverseWithIndex(this.getSize()-2);
        last.setNext(null);
    }

    //display/toString
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
