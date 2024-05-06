package PASD.ADT.MyStack;

import java.math.BigInteger;

public class StackList {
    public StackNode head;
    private int size;

    public StackList(){
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void push(int value){
        StackNode node = new StackNode(value);
        node.setNext(this.head);
        this.head = node;
        size++;
    
    }
    public void push(BigInteger valueBI){
        StackNode node = new StackNode(valueBI);
        node.setNext(this.head);
        this.head = node;
        size++;
    }

    public void push(StackNode node){
        node.setNext(this.head);
        this.head = node;
        size++;
    }

    public StackNode pop(){
        StackNode node = this.head;
        this.head = node.getNext();
        node.setNext(null);
        this.size--;
        return node;
    }

    public int peek(){
        return isEmpty() ? (int)Double.NaN : this.head.getValue();
    }

    public int getSize(){
        return this.size;
    }

    public void print(){
        StackNode cur = this.head;
        int idx = this.size-1;
        if(isEmpty()){
            System.out.println("Stack Kosong");
        } else {
            while (cur != null) {
                System.out.println(idx+""+cur.toString());
                cur = cur.getNext();
                idx--;
            }
        }
    }
}
