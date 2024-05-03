package DariKawan.Fazri;

import PASD.ADT.ListNode.ListNode;

public class LinkedListWithTail {
    public ListNode head;
    public ListNode tail;

    // No-arg/default constructor
    public LinkedListWithTail() {
        this.head = null;
        this.tail = null;
    }

    // Constructor with arg
    public LinkedListWithTail(int value) {
        ListNode newNode = new ListNode(value);
        this.head = newNode;
        this.tail = newNode;
    }

    // Insert at the beginning of the list
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.setNext(this.head);
        this.head = newNode;
        if (this.tail == null) {
            this.tail = newNode;
        }
    }

    // Insert after a certain node
    public void insertAfter(ListNode prevNode, int value) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null.");
            return;
        }
        ListNode newNode = new ListNode(value);
        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
        if (this.tail == prevNode) {
            this.tail = newNode;
        }
    }

    // Append to the end of the list
    public void append(int value) {
        ListNode newNode = new ListNode(value);
        if (this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    // Delete the first node
    public ListNode deleteFirst() {
        if (this.head == null) {
            return null;
        }
        ListNode deletedNode = this.head;
        this.head = this.head.getNext();
        if (this.head == null) {
            this.tail = null;
        }
        return deletedNode;
    }

    // Delete after a certain node
    public ListNode deleteAfter(ListNode prevNode) {
        if (prevNode == null || prevNode.getNext() == null) {
            return null;
        }
        ListNode deletedNode = prevNode.getNext();
        prevNode.setNext(deletedNode.getNext());
        if (this.tail == deletedNode) {
            this.tail = prevNode;
        }
        return deletedNode;
    }

    // Delete the last node
    public ListNode deleteLast() {
        if (this.head == null) {
            return null;
        }
        if (this.head.getNext() == null) {
            ListNode deletedNode = this.head;
            this.head = null;
            this.tail = null;
            return deletedNode;
        }
        ListNode currentNode = this.head;
        while (currentNode.getNext().getNext() != null) {
            currentNode = currentNode.getNext();
        }
        ListNode deletedNode = currentNode.getNext();
        currentNode.setNext(null);
        this.tail = currentNode;
        return deletedNode;
    }

    // Get the node at a certain index
    public ListNode getNodeAt(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative.");
        }
        ListNode currentNode = this.head;
        int currentIndex = 0;
        while (currentNode != null) {
            if (currentIndex == index) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
            currentIndex++;
        }
        throw new IndexOutOfBoundsException("Index out of bounds for length " + currentIndex);
    }

    public int size() {
        ListNode currentNode = this.head;
        int count = 0;
        while (currentNode != this.tail) {
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }

    // Print all nodes in the list
    public void printList() {
        ListNode currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }
}
