package com.deepu.dsa.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    // Insert at first position in LL
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        // It means the very first element is added
        if(tail==null){
            tail=head;
        }
        size++;
    }

    // Insert at last position
    public void insertLast(int val){

        if(head == null){
            // means first element hai ye, so sidhe add kar do isko first position or
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;

//        if(head==null){
//            head=tail;
//        }
        size++;
    }

    // Print all elements of LL
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    // Insert in between
    // to insert new element, we must know the previous and next element information.
    public void insertInBetween(int value,int preVal, int nextVal){
        Node node=new Node(value);
        Node temp=head;
        if(temp.data == preVal && temp.next.data == nextVal){
            temp.next = node;
            node.next = temp.next;
        }
        temp=temp.next;
    }

    public void insert(int val,int index){
        if(index > size){
            try {
                throw new Exception("illegal addition");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        // when you come from this loop, you will point to previous node after after which new node is to be inserted

        Node node=new Node(val,temp.next);
        temp.next = node;
        size++;
    }
}
