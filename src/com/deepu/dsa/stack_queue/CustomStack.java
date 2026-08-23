package com.deepu.dsa.stack_queue;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item) throws StackException {
        ptr++;
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty! Cannot pop from it");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek into stack because it is empty");
        }
        return data[ptr];
    }

    public int size(){
        return ptr+1;
    }


    public boolean isFull() {
        return ptr == data.length ;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }


}
