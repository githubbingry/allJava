package PASD.ADT.MyQueue;

public class QueueNode {
    private int value;
    private QueueNode next;

    public QueueNode() {
        this.value = 0;
        this.next = null;
    }

    public QueueNode(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public QueueNode getNext() {
        return this.next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public void setNext(int value) {
        this.next = new QueueNode(value);
    }

    @Override
    public String toString() {
        return "[value=" + value + "]";
    }
}
