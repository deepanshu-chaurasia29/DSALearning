package com.deepu.dsa.stack_queue;

public class CircularQueue {

    private int[] data;
    private static final int DEFAULT_SIZE=10;

    protected int front=0;
    protected int rear=0;
    private int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull() {
        return size == data.length ;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item) {
        if(isFull()){
            System.out.println("queue is full");
            return false;
        }
        data[rear++] = item;
        rear = rear % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int size(){
        return size;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i] + "-> ");
            i++;
            i = i % data.length;
        }while (i != rear);
        System.out.println();



    }

}
