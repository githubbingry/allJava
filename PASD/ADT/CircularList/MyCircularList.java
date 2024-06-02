package PASD.ADT.CircularList;

import PASD.ADT.ListNode.ListNode;

public class MyCircularList {
    ListNode head;
    ListNode tail;

    MyCircularList(int value){
        ListNode nodde = new ListNode(value);
        this.head = nodde;
        this.tail = nodde;
        this.head.setNext(this.tail);
        this.tail.setNext(this.head);
    }

    public void insertFirst(ListNode node){
        if(this.head == null){
            this.head = node;
            this.tail = node;
            this.head.setNext(this.tail);
            this.tail.setNext(this.head);
        } else {
            node.setNext(this.head);
            this.head = node;
            this.tail.setNext(this.head);
        }
    }

    public void cetak(){
        ListNode current = this.head;
        do{
            System.out.println(current.toString());
            current = current.getNext();
        }while(current != this.head);
    }
}
