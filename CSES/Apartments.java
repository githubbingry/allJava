package CSES;

import java.util.LinkedList;
import java.util.Scanner;

// import PASD.ADT.ListNode.ListNode;
// import PASD.ADT.ListNode.MyLinkedList;

public class Apartments {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        // usingArray(x);
        // usingLinkedList(x);
        usingMyList(x);
        x.close();
    }

    static void isiArray(int[] a, Scanner x){
        for(int i = 0; i < a.length; i++){
            a[i] = x.nextInt();
        }
    }

    static void usingArray(Scanner x){
        int[] n = new int[x.nextInt()];
        int[] m = new int[x.nextInt()];
        int k = x.nextInt(), count = 0;
        isiArray(n, x);
        isiArray(m, x);
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < m.length; j++){
                if(Math.abs(m[j] - n[i]) <= k){
                    count++;
                    // System.out.println("udin "+i+" "+j);
                    m[j] = 0;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    static void usingLinkedList(Scanner x){ //lebih lama dari gunakan array?
        int ns = x.nextInt();
        int ms = x.nextInt();
        int k = x.nextInt(), count = 0;
        LinkedList<Integer> n = new LinkedList<>();
        LinkedList<Integer> m = new LinkedList<>();
        isiList(n, ns, x);
        isiList(m, ms, x);
        for(int i = 0; i < n.size(); i++){
            for(int j = 0; j < m.size(); j++){
                if(Math.abs(m.get(j) - n.get(i)) <= k){
                    // System.out.println("udin "+i+" "+j);
                    count++;
                    m.remove(j);
                    break;
                }
            }
        }
        System.out.println(count);
    }

    static void isiList(LinkedList<Integer> l, int n, Scanner x){
        for(int i = 0; i < n; i++){
            l.add(x.nextInt());
        }
    }

    static void usingMyList(Scanner x){
        int ns = x.nextInt();
        int ms = x.nextInt();
        int k = x.nextInt(), count = 0;
        MyLinkedList n = new MyLinkedList();
        MyLinkedList m = new MyLinkedList();
        isiMyList(n, ns, x);
        isiMyList(m, ms, x);
        ListNode nc = n.head;
        ListNode mc = m.head;
        for(int i = 0; i < ns; i++, nc = nc.getNext()){
            for(int j = 0; j < m.getSize(); j++, mc = mc.getNext()){
                if(j == 0){
                    mc = m.head;
                    if(Math.abs(mc.getValue()-nc.getValue()) <= k){
                        // System.out.println("uda "+nc.getValue()+" "+mc.getValue()+ " "+m.getSize());
                        count++;
                        m.deleteFirst();
                        break;
                    }
                }
                if (mc.getNext() != null &&(Math.abs(mc.getNext().getValue()-nc.getNext().getValue()) <= k)){
                    count++;
                    // System.out.println("udin "+nc.getNext().getValue()+" "+mc.getNext().getValue()+" "+m.getSize());
                    m.deleteAfter(mc);
                    break;
                }
            }
        }
        System.out.println(count);
    }

    static void isiMyList(MyLinkedList l, int n, Scanner x){
        for(int i = 0; i < n; i++){
            l.append(x.nextInt());
        }
    }
}

class MyLinkedList {
    public ListNode head;
    private int size; // optional

    //constructor w/no argument
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public MyLinkedList(int value) {
        this.head = new ListNode(value);
        this.size = 1;
    }

    //todo insert for a linkedlist object, array

    //O(1), insert first
    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        node.setNext(this.head);
        this.head = node;
        this.size++;
    }
    
    public void insertFirst(ListNode node){
        node.setNext(this.head);
        this.head = node;
        this.size++;
    }
    
    //O(n), insert last/append
    public void append(int value){
        ListNode node = new ListNode(value);
        if (this.head == null){
            this.head = node;
        } else {
            ListNode current = this.traverse();
            current.setNext(node);
        }
        this.size++;
    }

    public void append(ListNode node){
        if (this.head == null){
            this.head = node;
        } else {
            ListNode current = this.traverse();
            current.setNext(node);
        }
        this.size++;
    }

    //O(n), insert after?
    public void insertAfter(int value, ListNode prevNode){
        ListNode node = new ListNode(value);
        node.setNext(prevNode.getNext());
        prevNode.setNext(node);
        this.size++;
    }

    //O(n), insert before?
    public void insertBefore(int value, ListNode nextNode){
        ListNode node = new ListNode(value);
        node.setNext(nextNode);
        nextNode = node;
        this.size++;
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
            ListNode prevNode = this.traverseWithIndex(index-1);
            node.setNext(prevNode.getNext());
            prevNode.setNext(node);
        }
        this.size++;
    }

    public void insertAt(int index, ListNode node){
        int size = this.getSize();
        if (index == 0 || (index + size) < 0){ //untuk index awal atau nilai absolut dari index negatif yng lebih besar dari 0, (|index| > size, index < 0)
            this.insertFirst(node);
        } else if (index >= size){ // out of bound/size dari linked list, append saja
            this.append(node);
        } else {
            if(index < 0) { //jika index negatif dan |index| < size, maka mengakses linked list dari belakang
                index += size;
            }
            ListNode prevNode = this.traverseWithIndex(index-1);
            node.setNext(prevNode.getNext());
            prevNode.setNext(node);
        }
        this.size++;
    }

    //O(n), traverse (find and visit)
    private ListNode traverse(){
        return this.traverseWithIndex(this.getSize());
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
        return this.size;
    }

    public int getSizeAfter(ListNode node){
        ListNode current = node;
        int size = 0;
        while(current != null){
            size++;
            current = current.getNext();
        }
        return size;
    }

    //todo exception handling in getAt, setAt, deleteAt index method when index < 0 or index >= size. make method getAfter, setAfter

    //O(1), getFirst
    public ListNode getFirst(){
        return this.head;
    }

    //O(n), getAt index
    public ListNode getAt(int index){
        return this.traverseWithIndex(index);
    
    }

    //O(n), getLast
    public ListNode getLast(){
        return this.traverse();
    }

    // O(1), setFirst
    public void setFirst(int value){
        this.head.setValue(value);
    }

    public void setFirst(ListNode node){
        this.head.setValue(node.getValue());
    }

    //O(n), setAt index
    public void setAt(int index, int value){
        ListNode current = this.traverseWithIndex(index);
        current.setValue(value);
    }

    public void setAt(int index, ListNode node){
        ListNode current = this.traverseWithIndex(index);
        current.setValue(node.getValue());
    }

    //O(n), setLast
    public void setLast(int value){
        ListNode current = this.traverse();
        current.setValue(value);
    }

    public void setLast(ListNode node){
        ListNode current = this.traverse();
        current.setValue(node.getValue());
    }

    //gini jg bs
    /*
    public void setLast(int value){
        this.setAt(this.getSize-1, value)
    }

    public void setLast(ListNode node){
        this.setAt(this.getSize-1, node)
    }
     */


    //O(1), deleteFirst
    public void deleteFirst(){
        this.head = this.head.getNext();
        this.size--;
    }

    public ListNode getDeleteFirst(){
        ListNode current = this.head;
        this.head = current.getNext();
        current.setNext(null);
        this.size--;
        return current;
    }
    
    //O(n), deleteLast
    public void deleteLast(){
        ListNode last = this.traverseWithIndex(this.getSize()-2);
        last.setNext(null);
        this.size--;
    }

    public ListNode getDeleteLast(){
        ListNode last = this.traverseWithIndex(this.getSize()-2);
        ListNode current = last.getNext();
        last.setNext(null);
        this.size--;
        return current;
    }

    //O(n), deleteAt index
    public void deleteAt(int index){
        ListNode prevNode = this.traverseWithIndex(index-1);
        prevNode.setNext(prevNode.getNext().getNext());
        this.size--;
    }

    public ListNode getDeleteAt(int index){
        ListNode prevNode = this.traverseWithIndex(index-1);
        ListNode current = prevNode.getNext();
        prevNode.setNext(prevNode.getNext().getNext());
        current.setNext(null);
        this.size--;
        return current;
    }

    //O(1), delete After
    public void deleteAfter(ListNode prevNode){
        prevNode.setNext(prevNode.getNext().getNext());
        this.size--;
    }

    public ListNode getDeleteAfter(ListNode prevNode){
        ListNode current = prevNode.getNext();
        prevNode.setNext(current.getNext());
        current.setNext(null);
        this.size--;
        return current;
    }

    //delete all after index/node

    //display/toString
    @Override
    public String toString(){
        int idx = 0;
        String text = "";
        ListNode current = this.head;
        while(current != null){
            text += idx + current.toString() + " ";
            current = current.getNext();
            idx++;
        }
        return text;
    }
}

class ListNode {
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

    public void setNext(int value) {
        this.next = new ListNode(value);
    }

    @Override
    public String toString() {
        return "[value=" + value + "]";
    }
}
