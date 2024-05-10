package PASD.ADT.MyQueue;

public class TestQueueList {
    public static void main(String[] args) {
        QueueList ql = new QueueList(100);
        ql.enqueue(200);
        ql.enqueue(300);
        ql.enqueue(4000);
        ql.print();
        
        QueueNode qn1 = new QueueNode(500);
        QueueNode qn2 = new QueueNode(500);
        ql.enqueue(qn1);
        ql.enqueue(qn2);
        ql.print();

        System.out.println(ql.dequeue());
        System.out.println(ql.dequeue());
        ql.print();
    }
}
