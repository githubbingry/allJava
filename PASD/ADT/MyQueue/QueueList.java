package PASD.ADT.MyQueue;

public class QueueList {
    public QueueNode front;
    public QueueNode rear;
    private int size;

    public QueueList(){
        this.front = null;
        this.rear = null;
        this.size= 0;
    }
    
    public QueueList(int value){
        QueueNode node = new QueueNode(value);
        this.front = node;
        this.rear = node;
        this.size= 1;
    }

    public QueueList(QueueNode node){
        this.front = node;
        this.rear = node;
        this.size= 1;
    }

    public boolean isEmpty(){
        return this.front== null;
    }

    public boolean isOneElement(){
        return !isEmpty() && this.front == this.rear && this.size == 1;
    }

    public void enqueue(int value){
        QueueNode node = new QueueNode(value);
        if(isEmpty()){
            this.front = this.rear = node;
        } else {
            this.rear.setNext(node);
            this.rear = node;
        }
        size++;
    }

    public void enqueue(QueueNode node){
        if(isEmpty()){
            this.front = this.rear = node;
        } else {
            this.rear.setNext(node);
            this.rear = node;
        }
        size++;
    }

    public QueueNode dequeue(){
        QueueNode deletedNode = this.front;
        if (isOneElement()){
            this.front = this.rear = null;
            this.size--;
        } else {
            this.front = deletedNode.getNext();
            deletedNode.setNext(null);
            this.size--;
        }
        return deletedNode;
    }

    public void print(){
        QueueNode node = this.front;
        System.out.printf("size = %d, ", this.size);
        if(isEmpty()){
            System.out.println("Queue kosong");
        } else {
            while(node != null){
                System.out.print(node.toString() + " ");
                node = node.getNext();
            }
            System.out.println();
        }
    }

    public int getSize(){
        return this.size;
    }


}
